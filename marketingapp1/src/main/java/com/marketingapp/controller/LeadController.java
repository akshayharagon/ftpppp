package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_new_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		emailService.sendSimpleMessage("psa@gmail.com", "test", "welcome");
		model.addAttribute("saveMsg", "Record is saved");
		return "create_new_lead";
	}
	
	@RequestMapping("/listLeads")
	public String getAllLeads(ModelMap model) {
	List<Lead> leads = leadService.listAll();
	model.addAttribute("leads", leads);
	return "search_result";
	}

	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id, ModelMap model) {
		leadService.deleteLeadById(id);
		
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "search_result";		
	}
	
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findOneLeadById(id);
		if(lead!=null) {
			model.addAttribute("lead", lead);
			return "updte_lead";
		} else{
			model.addAttribute("error", "No record found");
			return"Error_page";
		}
	}
	
	@RequestMapping("/UpdateLead")
	public String updteLead(LeadData data, ModelMap model) {
		Lead l = new Lead();
		l.setId(data.getId());
		l.setEmail(data.getEmail());
		l.setMobile(data.getMobile());
		l.setFirstName(data.getFirstName());
		l.setLastName(data.getLastName());
		
		leadService.saveLead(l);
		
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "search_result";	
	}
}
