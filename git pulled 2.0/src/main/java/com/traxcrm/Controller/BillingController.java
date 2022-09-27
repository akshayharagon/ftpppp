package com.traxcrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.Entity.Contact;
import com.traxcrm.Services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping("/generateBill")
	public String billById(@RequestParam ("id") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
	}
}
