package com.flipkart.bean;

public class GymCenter {
    private int id;
    private String gymName;
    private String gymEmailAddress;
    private boolean isApproved;
    private String gymLocation;
    private int numOfSeats;
    private int ownerId;

    public GymCenter() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId(){
        return this.ownerId;
    }

    public void setOwnerId(int ownerId){
        this.ownerId = ownerId;
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

    public int getNumOfSeats() {
        return this.numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
