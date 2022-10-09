package com.example.projectlayup.models;

import java.util.List;

public class User {
    String userId;
    List<String> bags; //contains bag ids
    List<String> bookings; //id for bookings

    public User() {
    }

    public List<String> getBags() {
        return bags;
    }

    public void addToBags(String bagId) {
        bags.add(bagId);
    }

    public void setBags(List<String> bags) {
        this.bags = bags;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getBookings() {
        return bookings;
    }

    public void setBookings(List<String> bookings) {
        this.bookings = bookings;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", bags=" + bags +
                ", bookings=" + bookings +
                '}';
    }
}
