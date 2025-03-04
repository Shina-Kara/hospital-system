package za.ac.cput.service;

import za.ac.cput.domain.CleaningStaff;
import za.ac.cput.domain.HospitalRoom;

import java.util.Set;

/*
    HospitalRoomService.java
    Service Interface for the CleaningStaff
    Author: Sinazo(216076498)
    Date: 12 August 2022
*/
public interface CleaningStaffService extends IService<CleaningStaff, String> {
    Set<CleaningStaff> getAll();
}
