package com.example.projectlayup.models;

import android.util.Log;

import java.util.List;

public class Booking {
    static final String TAG = "Booking";
    String bookingId; //confirmation id from reservation
    String userId;
    String emailAddress;
    int priceInDollars; // base will be flight price(dollars). will update to reflect added things
    String flightNumber;
    List<String> bags; // Contains ids of bags under particular booking.
    // TODO - origin, dest,
    String region;

    public Booking() {
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(int price) {
        this.priceInDollars = price;
    }

    public List<String> getBags() {
        return bags;
    }

    public void addBag(String bagId) {
        bags.add(bagId);
    }

    public void setBags(List<String> bags) {
        this.bags = bags;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", userId='" + userId + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", price='" + priceInDollars + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }
}
