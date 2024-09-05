package com.flipkart.client;

import com.flipkart.bean.GymOwner;
import com.flipkart.business.AdminService;
import com.flipkart.business.GymOwnerService;

import java.util.Scanner;

public class FlipFitGymOwnerClientMenu{
    public static void login(){
        Scanner sc = new Scanner(System.in);
        String username,password;

        System.out.println("Enter username: ");
        username = sc.nextLine();
        password = sc.nextLine();

        boolean verifiedCredentials = AdminService.verifyingGymOwner();

        if(verifiedCredentials){
            System.out.println("GymOwner login successful. Please proceed to menu.");
            FlipFitGymOwnerClientMenu.showMenu();
        } else System.out.println("GymOwner login failed. Retry.");
    }

    public static void register(){
        Scanner sc = new Scanner(System.in);
        String username,pincode,pan;

        System.out.println("Enter username: ");
        username = sc.nextLine();

        System.out.println("Enter pincode: ");
        pincode = sc.nextLine();

        System.out.println("Enter PAN: ");
        pan = sc.nextLine();

        boolean approvedCredentials = AdminService.approveGymOwner();

        if(approvedCredentials){
            System.out.println("GymOwner registration successful. Please proceed to menu.");
            FlipFitGymOwnerClientMenu.showMenu();
        } else System.out.println("GymOwner registration failed.");
    }

    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for viewing upcoming bookings");
        System.out.println("Enter 2 for adding a slot");
        System.out.println("Enter 3 for deleting a slot");
        System.out.println("Enter 4 for viewing past bookings");
        System.out.println("Enter 5 to change password");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                GymOwnerService.viewUpcomingBookings();
                break;
            case 2:
                GymOwnerService.addSlot();
                break;
            case 3:
                GymOwnerService.deleteSlot();
                break;
            case 4:
                GymOwnerService.viewPastBookings();
                break;
            case 5:
                GymOwnerService.changePassword();
                break;
        }
    }
}