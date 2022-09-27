package com.traxcrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.Entity.Contact;
import com.traxcrm.Services.ContactService;
import com.traxcrm.Services.LeadService;

@Controller
public class ContactController {

	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("conts", contacts);
		return "contact_seach_result2";
	}
	
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
}
