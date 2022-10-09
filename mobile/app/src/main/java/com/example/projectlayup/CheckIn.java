package com.example.projectlayup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectlayup.models.Bag;
import com.example.projectlayup.models.Booking;

import java.util.HashMap;

public class CheckIn extends AppCompatActivity implements View.OnClickListener {
    private EditText etBagId, etBagWeight, tvBagFee;
    private TextView tvBagNum, tvTotalAmount;
    private Button btnGetWeight, btnAddBag, btnPay;
    private Booking userBooking;
    Bag currentBag;

    private Double currentBagWeight, currentBagFee;

    private int currentBagNum, totalBaggageFee, bagCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        tvBagFee = findViewById(R.id.tvBagFee);
        etBagId = findViewById(R.id.etBagId);
        etBagWeight = findViewById(R.id.etBagWeight);
        tvBagNum = findViewById(R.id.tvBagNum);
        tvTotalAmount = findViewById(R.id.tvTotalAmount);
        btnAddBag = findViewById(R.id.btnAddBag);
        btnGetWeight = findViewById(R.id.btnGetWeight);
        btnPay = findViewById(R.id.btnPay);

        currentBagNum = 1;
        currentBag = new Bag();



        userBooking = new Booking();
        userBooking.setBookingId("0001");
        userBooking.setRegion("domestic");
    }

    Double calculateBaggageFee (Double bagWeight){
        Double baggageFee = 0.0; //default fee?

        // TODO: 1 - account for regular (for the different regions)
        // 2 - account for overweight
        //  3 - account for oversize
        // 4 - take special situations(flagship first conserved, people with discounts basically) into consideration
        HashMap<String, Double> domesticPrices = new HashMap<String, Double>();
        domesticPrices.put("1", 30.00);
        domesticPrices.put("2", 40.00);
        domesticPrices.put("3", 150.00);
        domesticPrices.put("4andUp", 200.00);



//        if (region.equals("domestic")) {
        if (currentBagNum < 4) {
            baggageFee= domesticPrices.get(String.valueOf(baggageFee));
        }
        else{
            baggageFee = domesticPrices.get("4andUp");
        }
        return baggageFee;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnGetWeight:
                currentBagWeight = Double.valueOf(etBagWeight.getText().toString());;
                Double baggageFee = calculateBaggageFee(currentBagWeight);
                Log.d("CHeck in", "Baggage fee for weight " + currentBagWeight + "is " + baggageFee);
                tvBagFee.setText(String.valueOf(baggageFee));
                break;

            case R.id.btnAddBag:
                Toast.makeText(this, "Bag has been added to your trip!", Toast.LENGTH_LONG).show();
                totalBaggageFee += Integer.valueOf(tvBagFee.getText().toString());
                Log.d("Add Bag", "New Baggage Fee: " + totalBaggageFee);
                tvTotalAmount.setText(String.valueOf(totalBaggageFee));
                currentBagNum = 2;
                tvBagNum.setText(currentBagNum);
                etBagWeight.requestFocus();
                etBagId.requestFocus();
                tvBagFee.setText(String.valueOf(0.00));

            case R.id.btnPay:
                Intent i = new Intent(this, PaymentActivity.class);
                i.putExtra("totalAmount", totalBaggageFee);
                startActivity(i);
                break;

        }
    }
}