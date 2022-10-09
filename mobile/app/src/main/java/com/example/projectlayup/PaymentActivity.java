package com.example.projectlayup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {
    int amount;
    private EditText etCardNumber, etExpiryDate, etCardholder, etCvv;
    private TextView tvAmount;
    private Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        etCardNumber = findViewById(R.id.etCardNumber);
        etCardholder = findViewById(R.id.etCardholder);
        etCvv = findViewById(R.id.etCvv);
        etExpiryDate = findViewById(R.id.etExpiryDate);
        tvAmount = findViewById(R.id.tvAmount);
        btnPay = findViewById(R.id.btnPay);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            amount = extras.getInt("totalAmount");
            tvAmount.setText(amount);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPay:
                startActivity(new Intent(this, DisplayBoarding.class));
        }

    }

    private void processPayment() {
        String cardholder = etCardholder.getText().toString().trim();
        String cardNumber = etCardNumber.getText().toString().trim();
        String cvv = etCvv.getText().toString().trim();
        String expiryDate = etExpiryDate.getText().toString().trim();

        //TODO: Use Mastercard API to process transaction; on success direct user to boarding info
        startActivity(new Intent(this, DisplayBoarding.class));


    }
}