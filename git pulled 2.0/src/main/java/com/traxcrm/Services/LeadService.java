package com.traxcrm.Services;

import java.util.List;

import com.traxcrm.Entity.Lead;

public interface LeadService {
	public void saveLead(Lead lead);
	public Lead getLeadbyId(long id);
	public void deleteOnelead(long id);
	public List<Lead> listAll();
}
