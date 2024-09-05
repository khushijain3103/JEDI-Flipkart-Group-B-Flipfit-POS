package com.flipkart.business.interfaces;

import com.flipkart.bean.Customer;
import com.flipkart.bean.GymCenter;
import com.flipkart.bean.GymOwner;

import java.util.List;

public interface IFlipFitAdmin {
    public boolean adminLogin();
    public List<GymOwner> getPendingOwnerList();
    public List<GymOwner> getApprovedOwnerList();
    public List<Customer> getCustomerList();
    public List<GymCenter> getGymCentreUsingOwnerId();
    public boolean validateOwner();
    public boolean deleteOwner();
    public boolean deleteCustomer();
}
