package com.flipkart.business;

import java.util.*;

import com.flipkart.bean.Customer;
import com.flipkart.dao.CustomerDAO;

public class CustomerService {
    CustomerDAO customerDatabase = new CustomerDAO();
    Customer customer = new Customer();

    public void createCustomer(int id, String name, String emailAddress, int phone, String password) {

        customer.setCustomerEmailAddress(emailAddress);
        customer.setCustomerName(name);
        customer.setCustomerId(id);
        customer.setCustomerPhone(phone);
        customer.setPassword(password);
        customerDatabase.add(customer);

        System.out.println("customer details added");
    }

    public void bookSlot(String gym) {
        Map<String, List<String>> gymMap = new HashMap<>();

        List<String> slotsGym1 = new ArrayList<>(Arrays.asList("10:00 AM", "2:00 PM", "5:00 PM"));
        List<String> slotsGym2 = new ArrayList<>(Arrays.asList("9:00 AM", "1:00 PM", "4:00 PM"));
        List<String> slotsGym3 = new ArrayList<>(Arrays.asList("11:00 AM", "3:00 PM", "6:00 PM"));

        gymMap.put("Gym1", slotsGym1);
        gymMap.put("Gym2", slotsGym2);
        gymMap.put("Gym3", slotsGym3);

        List<String> presentSlot = gymMap.get(gym);
        System.out.println("Available slots at " + gym);
        int op = 1;

        for(String slot : presentSlot){
            System.out.println("Option " + op + ": " + slot);
            op++;
        }

        System.out.println("Choose slot option: ");
        Scanner in = new Scanner(System.in);
        String option = in.next();
        System.out.println("Slot booked successfully");

        gymMap.get(gym).remove(option);
    }

    public void searchGym(String location) {
        Map<String, String> gymMap = new HashMap<>();

        gymMap.put("Location1", "Gym1");
        gymMap.put("Location2", "Gym2");
        gymMap.put("Location3", "Gym3");

        String selectedGym = gymMap.get(location);

        if (selectedGym != null) {
            System.out.println("Gym Found: " + selectedGym);
        } else {
            System.out.println("No gym found at the specified location.");
        }
        bookSlot(selectedGym);
    }

    public String getCustomerDetails(){
        CustomerDAO customer = new CustomerDAO();
        return "get Customer Details";
    }

    public boolean viewAllGymCenters(int id) {
        System.out.println("view All Gym Centers");
        return true;
    }

    public void isAlreadyBooked() {
        System.out.println("is Already Booked");
    }

    public void cancelSlot() {
        System.out.println("cancel Slot");
    }

    public void viewAllBookings() {
        System.out.println("viewAllBookings");
    }

}