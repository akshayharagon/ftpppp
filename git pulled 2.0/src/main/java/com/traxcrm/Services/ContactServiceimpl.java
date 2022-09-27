package com.traxcrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.Entity.Contact;
import com.traxcrm.Repository.ContactRepository;

@Service
public class ContactServiceimpl implements ContactService {
	
	@Autowired
	private ContactRepository contrepo;

	@Override
	public void saveContact(Contact cont) {
		contrepo.save(cont);
	}

	@Override
	public List<Contact> listAll() {
		List<Contact> conts = contrepo.findAll();
		return conts;
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contrepo.findById(id);
		return findById.get();
	}

}
