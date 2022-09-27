package com.hotelbooking.services;

import java.util.List;

import com.hotelbooking.entities.Resident;

public interface ResidentSerivice {
public void saveResident(Resident resident);

public List<Resident> allResidents();

public void deleteresident(int id);

public Resident findOneResidentById( int id);
}
