package com.flipkart.client;
import com.flipkart.business.AdminService;

import java.util.*;

public class FlipFitAdminClientMenu{
    public static void showMenu(){

        Scanner sc = new Scanner(System.in);

        int choice=0;
        AdminService adminService = new AdminService();

        while(choice!=8){

        System.out.println("FlipFit Admin Menu");

        System.out.println("1 View Pending Owners List");
        System.out.println("2 View approved Owners List");
        System.out.println("3 View Customers List");
        System.out.println("4 View Approved Gym centers of an Owner");
        System.out.println("5 Validate an Owner");
        System.out.println("6 Delete an Owner");
        System.out.println("7 Delete a Customer");
        System.out.println("8 Logout");

        choice = sc.nextInt();
       
        switch(choice){
            case 1:
                adminService.getPendingOwnerList();
                break;
            case 2:
                adminService.getApprovedOwnerList();
                break;
            case 3:
                adminService.getCustomerList(); 
                break;
            case 4:
                adminService.getGymCentreUsingOwnerId();
                break;
            case 5:
                adminService.validateOwner();
                break;
            case 6:
                adminService.deleteOwner();
                break;
            case 7:
                adminService.deleteCustomer();
                break;
            default: break;
            }
        }
    }

}