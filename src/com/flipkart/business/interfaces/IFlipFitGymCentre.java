package com.flipkart.business.interfaces;

import com.flipkart.bean.GymCenter;
import com.flipkart.bean.Slot;

import java.util.List;

public interface IFlipFitGymCentre {
    public GymCenter updateGymCentre(GymCenter flipFitGymCentre);
    public boolean deleteGymCentre(int centreId);
    public List<Slot> viewAvailableSlots(int centreId);
}
