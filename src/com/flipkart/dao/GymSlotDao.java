package com.flipkart.dao;

import com.flipkart.bean.GymCenter;
import com.flipkart.bean.Slot;

import java.util.ArrayList;
import java.util.List;

public class GymSlotDao {
    List<Slot> gymSlotList = new ArrayList<Slot>();

    public void addSlot(Slot slot){
        gymSlotList.add(slot);
    }

    public void deleteSlot(int slotID){
        gymSlotList.remove(slotID);
    }

    public void viewAllSlots(){
        for(Slot gymSlot : gymSlotList)
        {
            System.out.println("GymCenter is : ");
            System.out.println(gymSlot.getGymId() + " , " +
                    gymSlot.getSlotId() + " , " +
                    gymSlot.getSeatAvailable() + " , " +
                    gymSlot.getTime()
            );
        }
    }
}
