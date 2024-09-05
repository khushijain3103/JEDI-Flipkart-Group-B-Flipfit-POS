package com.flipkart.bean;

import java.util.Random;

public class GymCenter {
    private int id;
    private String gymName;
    private String gymEmailAddress;
    private boolean isApproved;
    private String gymLocation;

    public GymCenter(String gymName , String gymEmailAddress , String gymLocation) {
        this.gymName = gymName;
        this.gymEmailAddress = gymEmailAddress;
        this.gymLocation = gymLocation;
        this.id = new Random().nextInt();
        this.isApproved = false;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGymName() {
        return this.gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getGymEmailAddress() {
        return this.gymEmailAddress;
    }

    public void setGymEmailAddress(String gymEmailAddress) {
        this.gymEmailAddress = gymEmailAddress;
    }

    public boolean isApproved() {
        return this.isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getGymLocation() {
        return this.gymLocation;
    }

    public void setGymLocation(String gymLocation) {
        this.gymLocation = gymLocation;
    }

}
