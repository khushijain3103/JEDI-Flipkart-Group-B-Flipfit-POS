package com.flipkart.business.interfaces;

import com.flipkart.bean.*;
import com.flipkart.exceptions.InvalidChoiceException;

import java.util.List;

public interface IFlipFitGymOwner {
    public GymCenter addCentre(GymCenter flipFitGymCentre) throws InvalidChoiceException;
    public List<GymCenter> viewCentres(GymOwner flipFitGymOwner);
    public List<Payments> viewPayments();
    public GymOwner editDetails(GymOwner flipFitGymOwner) throws InvalidChoiceException;
    public GymOwner registerOwner(GymOwner owner);
    public User login(User user);

    Slot addSlot(Slot flipFitSlot);
}
