package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotelbooking.dto.ResidentData;
import com.hotelbooking.entities.Resident;
import com.hotelbooking.services.ResidentSerivice;

@Controller
public class ResidentController {
	
	@Autowired
	private ResidentSerivice residentserv;
	
	@RequestMapping("/createResident")
	public String newResident() {
		return "create_new_resident";
	}

	@RequestMapping("/saveResident")
	public String saveOneResident(@ModelAttribute("Resident") Resident resident, ModelMap model) {
		residentserv.saveResident(resident);
		model.addAttribute("saveMsg", "Your data is Saved! Thank you");
		return"create_new_resident";
		
	}
	
	@RequestMapping("/allResident")
	public String allResidents(ModelMap model) {
		List<Resident> residents = residentserv.allResidents();
		model.addAttribute("residents", residents);
		return"all_residents";
	}
	
	@RequestMapping("/delete")
	public String deleteOneResident(@RequestParam ("id") int id, ModelMap model) {
		residentserv.deleteresident(id);
		
		List<Resident> residents = residentserv.allResidents();
		model.addAttribute("residents", residents);
		return"all_residents";	
		}
	
	@RequestMapping("/update")
	public String updateOneResident(@RequestParam ("id") int id, ModelMap model) {
		Resident resident = residentserv.findOneResidentById(id);
		if (resident!=null) {
			model.addAttribute("resident", resident);
			return "update_resident";
		}
		else
		{
			model.addAttribute("error", "No record found");
			return"Error_page";
		}
		}
	
	@RequestMapping("/updateResident")
	public String updateResident(ResidentData data, ModelMap model) {
		Resident r = new Resident();
		r.setId(data.getId());
		r.setName(data.getName());
		r.setAge(data.getAge());
		r.setCity(data.getCity());
		r.setEmail(data.getEmail());
		r.setMobile(data.getMobile());
		
		residentserv.saveResident(r);

		List<Resident> residents = residentserv.allResidents();
		model.addAttribute("residents", residents);
		return"all_residents";	
		}
}
