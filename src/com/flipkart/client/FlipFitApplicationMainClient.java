package com.flipkart.client;

import com.flipkart.exceptions.InvalidChoiceException;

import java.util.*;

public class FlipFitApplicationMainClient {
    public static void main(String[] args) throws InvalidChoiceException {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Welcome To FlipFit: ");
            System.out.println("Type " +
                    "\n 1-> Login, " +
                    "\n 2-> Registration of Customer " +
                    "\n 3-> Registration of Gym Owner " +
                    "\n 4-> Exit \n");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {

                    System.out.println("Login");
                    System.out.print("Enter your emailId:> ");
                    String username = sc.next();
                    System.out.print("Enter your password:> ");
                    String password = sc.next();
                    System.out.print("Enter your role:> Customer/Admin/GymOwner ");
                    String role = sc.next();
                    // System.out.println("Login Successful");

                    switch (role) {
                        case "Customer": {
                            // customer menu
                            System.out.println("Customer Menu");
                            FlipFitCustomerClientMenu.showMenu();
                            break;
                        }
                        case "Admin": {
                            // admin menu
                            System.out.println("Admin Menu");
                            FlipFitAdminClientMenu.showMenu();
                            break;
                        }
                        case "GymOwner": {
                            System.out.println("GymOwner Menu");
                            FlipFitGymOwnerClientMenu.showMenu();
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Registration of gym customer");
                    System.out.println("Enter your email address:> ");
                    String emailID = sc.next();
                    System.out.println("Enter your phone number:> ");
                    String phoneNumber = sc.next();
                    System.out.println("Enter your city:> ");
                    String city = sc.next();
                    System.out.println("Enter your pin code:> ");
                    String pinCode = sc.next();
                    System.out.println("Enter your password:> ");
                    String password = sc.next();
                    System.out.println("Enter username: ");
                    String username = sc.next();

                    System.out.println("Registration completed");
                    System.out.println("Customer Menu");
                    FlipFitCustomerClientMenu.showMenu();

                    break;
                }
                case 3: {
                    System.out.println("Registration of gym owner");
                    System.out.println("Enter your email address:> ");
                    String emailID = sc.next();
                    System.out.println("Enter your phone number:> ");
                    String phoneNumber = sc.next();
                    System.out.println("Enter your city:> ");
                    String city = sc.next();
                    System.out.println("Enter your pin code:> ");
                    String pinCode = sc.next();
                    System.out.println("Enter your password:> ");
                    String password = sc.next();
                    System.out.println("Enter username: ");
                    String username = sc.next();
                    System.out.println("Enter your panId: ");
                    String panId = sc.next();
                    System.out.println("Enter your gstNum: ");
                    String gstNum = sc.next();
                    System.out.println("Enter your aadharNumber: ");
                    String aadharNumber = sc.next();

                    System.out.println("Registration completed");
                    FlipFitGymOwnerClientMenu.showMenu();

                    break;
                }
                case 4: {
                    System.out.println("Exit");
                    break;
                }
            }
        } while (choice != 5);
    }

}
