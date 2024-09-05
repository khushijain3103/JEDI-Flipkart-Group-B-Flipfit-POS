package com.flipkart.client;

import com.flipkart.bean.GymCenter;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.Slot;
import com.flipkart.business.AdminService;
import com.flipkart.business.GymOwnerService;
import com.flipkart.exceptions.InvalidChoiceException;

import java.util.Scanner;

public class FlipFitGymOwnerClientMenu{

    static GymOwnerService gymOwnerService = new GymOwnerService();

    public static void login() throws InvalidChoiceException {
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

    public static void register() throws InvalidChoiceException {
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

    public static void showMenu() throws InvalidChoiceException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for viewing all bookings");
        System.out.println("Enter 2 for adding a slot");
        System.out.println("Enter 3 for deleting a slot");
        System.out.println("Enter 4 to view all Slots");
        System.out.println("Enter 5 for adding a centre");
        System.out.println("Enter 6 for viewing all centres");

        int choice = sc.nextInt();



        switch(choice){
            case 1:
                gymOwnerService.viewAllBookings();
                break;
            case 2:
                System.out.println("Enter your GymID");
                int gymID = sc.nextInt();

                System.out.println("Enter your seatAvailable");
                int seatAvailable = sc.nextInt();

                System.out.println("Enter your time");
                String time = sc.next();

                Slot slot = new Slot(gymID , seatAvailable , time);
                gymOwnerService.addSlot(slot);

                break;
            case 3:

                System.out.println("Enter your SlotID");
                int slotID = sc.nextInt();
                gymOwnerService.deleteSlot(slotID);

                break;
            case 4:
                gymOwnerService.viewAllSlots();
                break;

            case 5:

                System.out.println("Enter your GymName");
                String gymName = sc.next();

                System.out.println("Enter your gymEmailAddress");
                String gymEmailAddress = sc.next();

                System.out.println("Enter your gymLocation");
                String gymLocation = sc.next();

                GymCenter center = new GymCenter(gymName , gymEmailAddress , gymLocation);

                gymOwnerService.addCenter(center);
                break;
            case 6:
                gymOwnerService.viewAllCenter();
                break;

        }
    }
}