package com.flipkart.bean;

import java.util.Random;

public class Slot {
    private int gymId;
    private int slotId;
    private int seatAvailable;
    private String time;

    public Slot(int gymId , int seatAvailable , String time) {
        this.gymId = gymId;
        this.seatAvailable = seatAvailable;
        this.time = time;
        this.slotId = new Random().nextInt();
    }

    public int getGymId() {
        return this.gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getSeatAvailable() {
        return this.seatAvailable;
    }

    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
