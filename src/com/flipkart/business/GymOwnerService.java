package com.flipkart.business;

public class GymOwnerService {
    public String getOwnerDetails(){
        return "get Owner Details";
    }

    public boolean viewAllSlots(int id) {
        System.out.println("view All Slots");
        return true;
    }

    public boolean isApprovedGymOwner(int id) {
        System.out.println("is Approved Gym Owner");
        return true;
    }

    public boolean isApprovedGymCenter() {
        System.out.println("is Approved Gym Center");
        return true;
    }

    public void addSlots() {
        System.out.println("add slots");
    }

    public boolean addGym(int id) {
        System.out.println("add gym");
        return true;
    }

    public boolean createSlot(int id) {
        System.out.println("create slot");
        return true;
    }

    public void viewAllGymCenters() {
        System.out.println("view All Gym Centers");
    }

    public void viewAllApprovedGymCenters() {
        System.out.println("view All Approved Gym Centers");
    }
}