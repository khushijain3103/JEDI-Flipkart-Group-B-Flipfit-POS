package com.flipkart.business.interfaces;

import com.flipkart.bean.BookedSlot;

public interface IFlipFitBookings {
    public BookedSlot makeBooking(int userID, int centreID, int startTime);
    public boolean deleteBooking(int bookingId);
}
