package com.flipkart.bean;

public class Payment {
    private int cardNum;
    private String custEmailAddress;

    public Payment() {
    }

    public int getCardNum() {
        return this.cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getCustEmailAddress() {
        return this.custEmailAddress;
    }

    public void setCustEmailAddress(String custEmailAddress) {
        this.custEmailAddress = custEmailAddress;
    }
}
