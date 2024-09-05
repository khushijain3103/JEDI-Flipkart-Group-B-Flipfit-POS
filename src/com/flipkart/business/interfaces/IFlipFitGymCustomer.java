package com.flipkart.business.interfaces;

import com.flipkart.bean.BookedSlot;
import com.flipkart.bean.Customer;
import com.flipkart.bean.GymCenter;
import com.flipkart.bean.User;
import com.flipkart.exceptions.InvalidChoiceException;

import java.util.List;

public interface IFlipFitGymCustomer {
    public List<BookedSlot> viewBookedSlots(int userId);
    public BookedSlot checkBookingConflicts(int userId, int slotTime);
    public List<GymCenter> viewCentres();
    public boolean makePayment(int userId);
    public Customer editDetails(Customer flipFitGymCustomer) throws InvalidChoiceException;
    public User login(User flipFitUser);
    public Customer registerCustomer(Customer flipFitGymCustomer);
}
