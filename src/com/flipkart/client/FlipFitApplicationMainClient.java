package com.flipkart.client;

import java.util.Scanner;

public class FlipFitApplicationMainClient{
    public static void main(String[] args) {
        System.out.println("Welcome to FlipFit App!");
        System.out.println("Enter 1 for Admin Login");
        System.out.println("Enter 2 for GymOwner Login");
        System.out.println("Enter 3 for Customer Login");


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                FlipFitAdminClientMenu.login();
                break;
            case 2:
                System.out.println("Enter 1 for existing gym owner");
                System.out.println("Enter 2 for new gym owner");

                int type = sc.nextInt();

                if(type==1) FlipFitGymOwnerClientMenu.login();
                else FlipFitGymOwnerClientMenu.register();

                break;
            case 3:
                System.out.println("Enter 1 for existing customer");
                System.out.println("Enter 2 for new customer");

                int type2 = sc.nextInt();

                if(type2==1) FlipFitCustomerClientMenu.login();
                else FlipFitCustomerClientMenu.register();

                break;
        }

    }

}