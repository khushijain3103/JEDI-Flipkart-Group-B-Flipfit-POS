package com.flipkart.bean;

public class BookedSlot {
    private int id;
    private int gymCentreId;
    private int slotId;
    private String custEmail;
    private String date;

    public BookedSlot() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGymCentreId() {
        return this.gymCentreId;
    }

    public void setGymCentreId(int gymCentreId) {
        this.gymCentreId = gymCentreId;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getCustEmail() {
        return this.custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
