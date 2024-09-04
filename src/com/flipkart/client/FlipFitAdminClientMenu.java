package com.flipkart.client;
import com.flipkart.business.AdminService;

import java.util.*;

public class FlipFitAdminClientMenu{
    public static void login(){
        Scanner sc = new Scanner(System.in);
        String username,password;

        System.out.println("Enter username: ");
        username = sc.nextLine();

        System.out.println("Enter password: ");
        password = sc.nextLine();

        boolean verifiedCredentials = true;
        // if DB verification successful, verifiedCredential = true;

        if(verifiedCredentials){
            System.out.println("Admin login successful. Please proceed to menu.");
            FlipFitAdminClientMenu.showMenu();
        } else System.out.println("Admin login failed. Retry.");
    }

    public static void showMenu(){
        System.out.println("1 for approving a GymOwner");
        System.out.println("2 for verifying a GymOwner");
        System.out.println("3 for removing a GymOwner");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                AdminService.approveGymOwner();
                break;
            case 2:
                AdminService.verifyingGymOwner();
                break;
            case 3:
                AdminService.removeGymOwner();
                break;
        }
    }

}