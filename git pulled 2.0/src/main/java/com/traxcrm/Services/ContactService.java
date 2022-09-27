package com.traxcrm.Services;

import java.util.List;

import com.traxcrm.Entity.Contact;

public interface ContactService {

	public void saveContact(Contact cont);

	public List<Contact> listAll();

	public Contact findContactById(long id);
}
