package com.flipkart.business.interfaces;

import com.flipkart.bean.*;
import com.flipkart.exceptions.InvalidChoiceException;

public interface IFlipFitGymOwner {
    public void addCenter(GymCenter flipFitGymCentre) throws InvalidChoiceException;
    public void viewAllCenter();
    public void viewAllBookings();
    public void deleteSlot(int slotID);
    public void addSlot(Slot flipFitSlot);
    public void viewAllSlots();
}
