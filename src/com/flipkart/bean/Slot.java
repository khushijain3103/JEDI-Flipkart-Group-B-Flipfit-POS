package com.flipkart.bean;

public class Slot {
    private int gymId;
    private int slotId;
    private int date;
    private int customerId;
    private String time;

    public Slot() {
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

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
