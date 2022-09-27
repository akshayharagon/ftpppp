package com.traxcrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.Entity.Lead;
import com.traxcrm.Repository.LeadRepository;

@Service
public class LeadServiceimpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void saveLead(Lead lead) {
		leadrepo.save(lead);
	}

	@Override
	public Lead getLeadbyId(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOnelead(long id) {
		leadrepo.deleteById(id);
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

}
