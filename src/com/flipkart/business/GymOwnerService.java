package com.flipkart.business;

import com.flipkart.bean.*;
import com.flipkart.business.interfaces.IFlipFitGymOwner;
import com.flipkart.exceptions.InvalidChoiceException;

public class GymOwnerService implements IFlipFitGymOwner {
    @Override
    public  void viewAllBookings(){
        System.out.println("All upcoming bookings printed");
    }

    @Override
    public  void deleteSlot(int slotID){
        System.out.println("Slot deleted");
    }

    @Override
    public void addSlot(Slot flipFitSlot) {
        System.out.println("Sot is added");
    }

    @Override
    public void addCenter(GymCenter flipFitGymCentre) throws InvalidChoiceException
    {
        System.out.println("center is added");
    }

    @Override
    public void viewAllCenter() {
        System.out.println("All the available centers");
    }
}