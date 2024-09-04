package com.flipkart.business;

public class CustomerService{
    public static boolean verifyCustomer(){
        System.out.println("Customer verified");
        return true;
    }

    public static void viewBookings(){
        System.out.println("All your bookings printed");
    }

    public static void modifyBooking(){
        System.out.println("Booking modified");
    }

    public static void bookSlot(){
        System.out.println("Your slot booked!");
    }
}