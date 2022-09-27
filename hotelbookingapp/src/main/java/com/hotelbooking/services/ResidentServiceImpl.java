package com.hotelbooking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entities.Resident;
import com.hotelbooking.repository.ResidentRepository;

@Service
public class ResidentServiceImpl implements ResidentSerivice {

	@Autowired
	private ResidentRepository residrepo;
	
	
	@Override
	public void saveResident(Resident resident) {
		residrepo.save(resident);
	}


	@Override
	public List<Resident> allResidents() {
		List<Resident> residents = residrepo.findAll();
		return residents;
	}

	@Override
	public void deleteresident(int id) {
		residrepo.deleteById(id);
		
	}


	@Override
	public Resident findOneResidentById(int id) {
		Optional<Resident> findById = residrepo.findById(id);
		if(findById.isPresent()) {
			Resident resident = findById.get();
			return resident;
		}
		else
		{
			return null;
		}
	}
}
