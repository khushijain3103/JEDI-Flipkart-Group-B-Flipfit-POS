package com.flipkart.business;

import com.flipkart.bean.*;
import com.flipkart.business.interfaces.IFlipFitGymOwner;
import com.flipkart.dao.GymCenterDao;
import com.flipkart.dao.GymSlotDao;
import com.flipkart.exceptions.InvalidChoiceException;

public class GymOwnerService implements IFlipFitGymOwner {

    GymCenterDao gymCenterDao = new GymCenterDao();
    GymSlotDao gymSlotDao = new GymSlotDao();

    @Override
    public  void viewAllBookings(){
        System.out.println("All upcoming bookings printed");
    }

    @Override
    public  void deleteSlot(int slotID){
        gymSlotDao.deleteSlot(slotID);
        System.out.println("Slot deleted");
    }

    @Override
    public void addSlot(Slot flipFitSlot) {
        gymSlotDao.addSlot(flipFitSlot);
        System.out.println("Slot is added");
    }

    @Override
    public void viewAllSlots(){
        gymSlotDao.viewAllSlots();
        System.out.println("All the available Slots");
    }

    @Override
    public void addCenter(GymCenter flipFitGymCentre) throws InvalidChoiceException
    {
        gymCenterDao.addCenter(flipFitGymCentre);
        System.out.println("center is added");
    }

    @Override
    public void viewAllCenter() {
        gymCenterDao.viewAllCenter();
        System.out.println("All the available centers");
    }
}