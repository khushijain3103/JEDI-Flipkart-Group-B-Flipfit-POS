package com.flipkart.dao;

import com.flipkart.bean.GymCenter;

import java.util.ArrayList;
import java.util.List;

public class GymCenterDao {

    List<GymCenter> gymCenterList = new ArrayList<GymCenter>();

    public void addCenter(GymCenter center){
        gymCenterList.add(center);
        System.out.println(gymCenterList.size());
    }

    public void viewAllCenter(){

        for(GymCenter gymCenter : gymCenterList)
        {
            System.out.println("GymCenter is : ");
            System.out.println(gymCenter.getGymName() + " , " +
                                gymCenter.getGymEmailAddress() + " , " +
                                gymCenter.getGymLocation() + " , " +
                                gymCenter.isApproved() + " , " +
                                gymCenter.getId()
                    );
        }
    }
}
