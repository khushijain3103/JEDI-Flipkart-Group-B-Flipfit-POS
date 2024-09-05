package com.flipkart.business.interfaces;

import com.flipkart.bean.Customer;
import com.flipkart.bean.Admin;
import com.flipkart.bean.GymCenter;
import com.flipkart.bean.GymOwner;

import java.util.List;

public interface IFlipFitAdmin {
    public boolean adminLogin(Admin flipFitAdmin);
    public List<GymOwner> getPendingOwnerList();
    public List<GymOwner> getApprovedOwnerList();
    public List<Customer> getUserList();
    public List<GymCenter> getGymCentreUsingOwnerId(int ownerId);
    public boolean validateOwner(int ownerId);
    public boolean deleteOwner(int ownerId);
}
