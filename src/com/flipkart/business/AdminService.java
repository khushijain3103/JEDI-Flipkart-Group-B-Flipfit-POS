package com.flipkart.business;

public class AdminService{
    public static boolean approveGymOwner(){
        System.out.println("GymOwner approved");
        return true;
    }

    public static boolean verifyingGymOwner(){
        System.out.println("GymOwner verified");
        return true;
    }

    public static void removeGymOwner(){
        System.out.println("GymOwner removed");
    }
}