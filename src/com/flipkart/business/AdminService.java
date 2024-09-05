package com.flipkart.business;

import com.flipkart.bean.Customer;
import com.flipkart.bean.Admin;
import com.flipkart.bean.GymCenter;
import com.flipkart.bean.GymOwner;
import com.flipkart.business.interfaces.IFlipFitAdmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Scanner;

public class AdminService implements IFlipFitAdmin {

    Scanner scanner = new Scanner(System.in);

    // Simulated data storage
    private Map<Integer, GymOwner> gymOwners;
    private Map<Integer, Customer> customers;
    private Map<Integer, GymCenter> gymCenters;
    private Map<Integer, GymOwner> pendingGymOwners;

    // Constructor to initialize collections
    public AdminService() {
        gymOwners = new HashMap<>();
        customers = new HashMap<>();
        gymCenters = new HashMap<>();
        pendingGymOwners = new HashMap<>();

        // Add dummy data
        initializeDummyData();
    }

    // Simulating some dummy data
    private void initializeDummyData() {
        // Admin doesn't need data, as you check login via the Admin object

        // Dummy Gym Owners
        GymOwner owner1 = new GymOwner();
        owner1.setOwnerId(1);
        owner1.setOwnerName("Owner One");
        owner1.setOwnerEmailAddress("owner1@gmail.com");

        GymOwner owner2 = new GymOwner();
        owner2.setOwnerId(2);
        owner2.setOwnerName("Owner Two");
        owner2.setOwnerEmailAddress("owner2@gmail.com");

        pendingGymOwners.put(owner1.getOwnerId(), owner1);
        pendingGymOwners.put(owner2.getOwnerId(), owner2);

        // Dummy Customers
        Customer customer1 = new Customer();
        customer1.setCustomerId(101);
        customer1.setCustomerName("Customer One");

        Customer customer2 = new Customer();
        customer2.setCustomerId(102);
        customer2.setCustomerName("Customer Two");

        customers.put(customer1.getCustomerId(), customer1);
        customers.put(customer2.getCustomerId(), customer2);

        // Dummy Gyms
        GymCenter gym1 = new GymCenter();
        gym1.setId(201);
        gym1.setGymName("Gym One");
        gym1.setOwnerId(owner1.getOwnerId());

        GymCenter gym2 = new GymCenter();
        gym2.setId(202);
        gym2.setGymName("Gym Two");
        gym2.setOwnerId(owner2.getOwnerId());

        gymCenters.put(gym1.getId(), gym1);
        gymCenters.put(gym2.getId(), gym2);
    }

    // Admin login method
    @Override
    public boolean adminLogin() {
        
        // System.out.print("Enter your username: ");
        // String username = scanner.nextLine();

        // System.out.print("Enter your password: ");
        // String password = scanner.nextLine();

        boolean isAuthenticated = true;              //customerService.authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("Login successful. Welcome, " + username + "!");
            
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
        return true;

        //return flipFitAdmin.getEmail().equals("admin@flipfit.com") && flipFitAdmin.getPassword().equals("admin123");
    }

    // Get the list of pending gym owners
    @Override
    public List<GymOwner> getPendingOwnerList() {
        
        System.out.println("All Pending Gym Owners:");
         
        List<GymOwner> pendingOwners = new ArrayList<>(pendingGymOwners.values());
        for (GymOwner owner : pendingOwners) {
            System.out.println(owner); // Assuming GymOwner has a suitable toString() method
        }
        return pendingOwners;
    }

    // Get the list of approved gym owners
    @Override
    public List<GymOwner> getApprovedOwnerList() {
       
        System.out.println("All Approved Gym Owners:");
        
        List<GymOwner> approvedOwners = new ArrayList<>(gymOwners.values());
        for (GymOwner owner : approvedOwners) {
            System.out.println(owner);
        }
        return approvedOwners;
    }

    // Get the list of all customers
    @Override
    public List<Customer> getCustomerList() {

        System.out.println("All Customers:");

        List<Customer> users = new ArrayList<>(customers.values());
        for (Customer user : users) {
            System.out.println(user);
        }

        return users;
    }

    // Get gym centers by gym owner ID
    @Override
    public List<GymCenter> getGymCentreUsingOwnerId() {
        System.out.println("Enter the ID of the Gym Owner:");
        int ownerId = scanner.nextInt();
        List<GymCenter> gymsByOwner = new ArrayList<>();
        for (GymCenter gym : gymCenters.values()) {
            if (gym.getOwnerId() == ownerId) {
                gymsByOwner.add(gym);
            }
        }

        for(GymCenter gym: gymsByOwner) {
            System.out.println("Gym ID: " + gym.getId() + ", Gym Name: " + gym.getGymName());
        }

        return gymsByOwner;
        
    }

    // Validate and approve gym owner
    @Override
    public boolean validateOwner() {

        System.out.println("Enter the ID of the Gym Owner to validate:");
        int ownerId = scanner.nextInt();
        GymOwner owner = pendingGymOwners.remove(ownerId); // Approve by removing from pending list
        if (owner != null) {
            gymOwners.put(ownerId, owner);  // Add to approved gym owners list
            return true;
        }
        System.out.println("Gym Owner not found with ID: " + ownerId);
        return false;
    }

    // Delete gym owner by ID
    @Override
    public boolean deleteOwner() {

        System.out.println("Enter the ID of the Gym Owner to delete:");

        int ownerId = scanner.nextInt();
        if (gymOwners.containsKey(ownerId)) {
            gymOwners.remove(ownerId); // Remove from approved gym owners
            System.out.println("Gym Owner with ID: " + ownerId + " deleted");
            return true;
        }
        System.out.println("Gym Owner not found with ID: " + ownerId);
        return false;
    }

    // Delete Customer owner by ID
    @Override
    public boolean deleteCustomer() {

        System.out.println("Enter the ID of the Customer to delete:");

        int customerId = scanner.nextInt();
        if (customers.containsKey(customerId)) {
            customers.remove(customerId); // Remove from approved gym owners
            System.out.println("Customer with ID: " + customerId + " deleted");
            return true;
        }
        System.out.println("Customer not found with ID: " + customerId);
        return false;
    }
}
