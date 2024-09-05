package com.flipkart.client;

import com.flipkart.business.AdminService;
import com.flipkart.business.CustomerService;
import com.flipkart.business.GymOwnerService;

import java.util.Scanner;

public class FlipFitCustomerClientMenu{
    public static void login(){
        Scanner sc = new Scanner(System.in);
        String username,password;

        System.out.println("Enter username: ");
        username = sc.nextLine();
        password = sc.nextLine();

        boolean verifiedCredentials = AdminService.verifyingGymOwner();

        if(verifiedCredentials){
            System.out.println("Customer login successful. Please proceed to menu.");
            FlipFitCustomerClientMenu.showMenu();
        } else System.out.println("Customer login failed. Retry.");
    }

    public static void register(){
        Scanner sc = new Scanner(System.in);
        String username,pincode,phone,email;

        System.out.println("Enter username: ");
        username = sc.nextLine();

        System.out.println("Enter pincode: ");
        pincode = sc.nextLine();

        System.out.println("Enter phone: ");
        phone = sc.nextLine();

        System.out.println("Enter email: ");
        email = sc.nextLine();

        System.out.println("Customer registration successful. Please proceed to menu.");
        FlipFitCustomerClientMenu.showMenu();
    }

    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for booking a new slot");
        System.out.println("Enter 2 to modify an existing booking");
        System.out.println("Enter 3 to view all your bookings");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                CustomerService.bookSlot();
                break;
            case 2:
                CustomerService.modifyBooking();
                break;
            case 3:
                CustomerService.viewBookings();
                break;
        }
    }
}