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
    private Map<Integer, GymCenter> pendingGymCenters;

    // Constructor to initialize collections
    public AdminService() {
        gymOwners = new HashMap<>();
        customers = new HashMap<>();
        gymCenters = new HashMap<>();
        pendingGymOwners = new HashMap<>();
        pendingGymCenters = new HashMap<>();

        // Add dummy data
        initializeDummyData();
    }

    // Simulating some dummy data
    private void initializeDummyData() {
        
        // Dummy Gym Owners (Approved)
        GymOwner approvedOwner1 = new GymOwner();
        approvedOwner1.setOwnerId(1);
        approvedOwner1.setOwnerName("Approved Owner One");
        approvedOwner1.setOwnerEmailAddress("approved_owner1@gmail.com");
        gymOwners.put(approvedOwner1.getOwnerId(), approvedOwner1);

        GymOwner approvedOwner2 = new GymOwner();
        approvedOwner2.setOwnerId(2);
        approvedOwner2.setOwnerName("Approved Owner Two");
        approvedOwner2.setOwnerEmailAddress("approved_owner2@gmail.com");
        gymOwners.put(approvedOwner2.getOwnerId(), approvedOwner2);

        // Dummy Gym Owners (Pending)
        GymOwner pendingOwner1 = new GymOwner();
        pendingOwner1.setOwnerId(3);
        pendingOwner1.setOwnerName("Pending Owner One");
        pendingOwner1.setOwnerEmailAddress("pending_owner1@gmail.com");
        pendingGymOwners.put(pendingOwner1.getOwnerId(), pendingOwner1);

        GymOwner pendingOwner2 = new GymOwner();
        pendingOwner2.setOwnerId(4);
        pendingOwner2.setOwnerName("Pending Owner Two");
        pendingOwner2.setOwnerEmailAddress("pending_owner2@gmail.com");
        pendingGymOwners.put(pendingOwner2.getOwnerId(), pendingOwner2);

        // Dummy Customers
        Customer customer1 = new Customer();
        customer1.setCustomerId(101);
        customer1.setCustomerName("Customer One");

        Customer customer2 = new Customer();
        customer2.setCustomerId(102);
        customer2.setCustomerName("Customer Two");

        customers.put(customer1.getCustomerId(), customer1);
        customers.put(customer2.getCustomerId(), customer2);

        // Dummy Gyms (Approved)
        GymCenter gym1 = new GymCenter();
        gym1.setId(201);
        gym1.setGymName("Approved Gym One");
        gym1.setOwnerId(approvedOwner1.getOwnerId());
        gymCenters.put(gym1.getId(), gym1);

        GymCenter gym2 = new GymCenter();
        gym2.setId(202);
        gym2.setGymName("Approved Gym Two");
        gym2.setOwnerId(approvedOwner2.getOwnerId());
        gymCenters.put(gym2.getId(), gym2);

        // Dummy Gyms (Pending)
        GymCenter pendingGym1 = new GymCenter();
        pendingGym1.setId(203);
        pendingGym1.setGymName("Pending Gym One");
        pendingGym1.setOwnerId(pendingOwner1.getOwnerId());
        pendingGymCenters.put(pendingGym1.getId(), pendingGym1);

        GymCenter pendingGym2 = new GymCenter();
        pendingGym2.setId(204);
        pendingGym2.setGymName("Pending Gym Two");
        pendingGym2.setOwnerId(pendingOwner2.getOwnerId());
        pendingGymCenters.put(pendingGym2.getId(), pendingGym2);
    }

    // Admin login method
    @Override
    public boolean adminLogin() {
        boolean isAuthenticated = true; // Simulated login success
        if (isAuthenticated) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
        return isAuthenticated;
    }

    // Get the list of pending gym owners
    @Override
    public List<GymOwner> getPendingOwnerList() {
        System.out.println("Pending Gym Owners:");
        List<GymOwner> pendingOwners = new ArrayList<>(pendingGymOwners.values());
        for (GymOwner owner : pendingOwners) {
            System.out.println(owner); // Assuming GymOwner has a suitable toString() method
        }
        return pendingOwners;
    }

    // Get the list of approved gym owners
    @Override
    public List<GymOwner> getApprovedOwnerList() {
        System.out.println("Approved Gym Owners:");
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
        for (GymCenter gym : gymsByOwner) {
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
            System.out.println("Gym Owner with ID " + ownerId + " approved.");
            return true;
        }
        System.out.println("Gym Owner not found with ID: " + ownerId);
        return false;
    }

    // Validate and approve gym center
    @Override
    public boolean validateGymCenter() {
        System.out.println("Enter the ID of the Gym Center to validate:");
        int gymId = scanner.nextInt();
        GymCenter gym = pendingGymCenters.remove(gymId); // Approve by removing from pending list
        if (gym != null) {
            gymCenters.put(gymId, gym);  // Add to approved gym centers list
            System.out.println("Gym Center with ID " + gymId + " approved.");
            return true;
        }
        System.out.println("Gym Center not found with ID: " + gymId);
        return false;
    }

    // Delete gym owner by ID
    @Override
    public boolean deleteOwner() {
        System.out.println("Enter the ID of the Gym Owner to delete:");
        int ownerId = scanner.nextInt();
        if (gymOwners.containsKey(ownerId)) {
            gymOwners.remove(ownerId); // Remove from approved gym owners
            System.out.println("Gym Owner with ID: " + ownerId + " deleted.");
            return true;
        }
        System.out.println("Gym Owner not found with ID: " + ownerId);
        return false;
    }

    // Delete Customer by ID
    @Override
    public boolean deleteCustomer() {
        System.out.println("Enter the ID of the Customer to delete:");
        int customerId = scanner.nextInt();
        if (customers.containsKey(customerId)) {
            customers.remove(customerId); // Remove from customer list
            System.out.println("Customer with ID: " + customerId + " deleted.");
            return true;
        }
        System.out.println("Customer not found with ID: " + customerId);
        return false;
    }
}
