package com.flipkart.business;

import com.flipkart.bean.Slot;
import com.flipkart.business.interfaces.IFlipFitSlots;

public class FlipFitSlotsBusiness implements IFlipFitSlots {

    public boolean updateAvailability(Slot flipFitSlots) {
        System.out.println("Updating Slot Availability");
        return true;
    }

    public void getSlotDetails() {
        System.out.println("Getting Slot Details");
    }

}