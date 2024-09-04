package com.flipkart.client;

import java.util.Scanner;

public class FlipFitGymOwnerClientMenu {

    public static void main(String args[]){
        System.out.println("Welcome to the FlipFit App");
        Scanner in = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Login");
        System.out.println("2. Change Password");
        System.out.println("3. Gym Customer Registration");
        System.out.println("4. Gym Owner Registration");
        System.out.println("5. Logout");

        int choice = in.nextInt();

        in.close();

        switch (choice) {
            case 1 :
                System.out.print("Enter your UserName");
                String userName = in.next();
                System.out.println("UserName: " + userName);

                System.out.print("Enter your Password");
                String password = in.next();

                System.out.print("Enter your role");
                String role = in.next();
                System.out.println("role: " + role);

            case 2 :
                System.out.print("Enter your old Password");
                String oldPassword = in.next();

                System.out.print("Enter your new Password");
                String newPassword = in.next();

                System.out.print("confirm your new Password");
                String confirmedNewPassword = in.next();

            case 3 :
                //call customer menu

            case 4 :
                //call gym owner menu

            case 5 :

        }

    }

}
