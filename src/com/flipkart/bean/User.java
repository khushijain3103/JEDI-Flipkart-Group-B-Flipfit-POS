package com.flipkart.bean;

public class User {
    private int userId;
    private String userName;
    private int userPhone;
    private int userLocation;
    private int userPassword;

    public User() {
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserLocation() {
        return this.userLocation;
    }

    public void setUserLocation(int userLocation) {
        this.userLocation = userLocation;
    }

    public int getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(int userPassword) {
        this.userPassword = userPassword;
    }
}
