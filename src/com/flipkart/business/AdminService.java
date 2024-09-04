package com.flipkart.business;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Customer;
import com.flipkart.dao.AdminDAO;
import com.flipkart.dao.CustomerDAO;

public class AdminService {
    AdminDAO adminDatabase = new AdminDAO();
    Admin admin = new Admin();

    public void createAdmin(int id, String name, String emailAddress, int phone, String password) {

        admin.setAdminEmailAddress(emailAddress);
        admin.setAdminName(name);
        admin.setAdminId(id);
        admin.setAdminPhone(phone);
        admin.setPassword(password);
        adminDatabase.add(admin);

        System.out.println("admin details added");
    }

    public String viewPendingGymRequests(){
        return "View pending gym requests";
    }

    public boolean viewPendingGymOwnerRequests(int id) {
        System.out.println("view Pending Gym Owner Requests");
        return true;
    }

    public boolean approveGymOwnerRegistration(int id) {
        System.out.println("approve Gym Owner Registration");
        return true;
    }

    public void viewAllApprovedGymOwners() {
        System.out.println("view All Approved Gym Owners");
    }

    public void viewAllApprovedGyms() {
        System.out.println("view All Approved Gyms");
    }
}