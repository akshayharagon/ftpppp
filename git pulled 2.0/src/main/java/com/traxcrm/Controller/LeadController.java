package com.traxcrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.Entity.Contact;
import com.traxcrm.Entity.Lead;
import com.traxcrm.Services.ContactService;
import com.traxcrm.Services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactService contservice;

	@RequestMapping("/")
	public String viewLeadPage() {
		return "view_lead_page";
	}
	
	@RequestMapping("/saveLead")
	public String saveOnelead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadservice.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadservice.getLeadbyId(id);
		
		Contact cont = new Contact();
		cont.setName(lead.getName());
		cont.setEmail(lead.getEmail());
		cont.setMobile(lead.getMobile());
		cont.setGender(lead.getGender());
		cont.setLeadSource(lead.getLeadSource());
		
		contservice.saveContact(cont);
		
		leadservice.deleteOnelead(id);
		
		List<Contact> conts=contservice.listAll();
		model.addAttribute("conts", conts);
		return "contact_seach_result2";
	}
	
	@RequestMapping("/listall")
	public String getAllLeads(Model map){
		List<Lead> leads=leadservice.listAll();
		map.addAttribute("leads", leads);
		return "lead_seach_result";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadservice.getLeadbyId(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}
