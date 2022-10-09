package com.example.projectlayup.models;

import org.json.JSONObject;

public class Bag {

    String bagId;
    String userId;
    Double currentWeightInPounds; // in pounds
    JSONObject dimensionsInInches; // contains width, length, height, all in inches

    public Bag(){
        currentWeightInPounds = 0.0;
    }


    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getCurrentWeightInPounds() {
        return currentWeightInPounds;
    }

    public void setCurrentWeightInPounds(Double currentWeight) {
        this.currentWeightInPounds = currentWeight;
    }

    public JSONObject getDimensionsInInches() {
        return dimensionsInInches;
    }

    public void setDimensionsInInches(JSONObject dimensions) {
        this.dimensionsInInches = dimensions;
    }

}

