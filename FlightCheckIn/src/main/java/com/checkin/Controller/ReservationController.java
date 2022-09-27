package com.checkin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.checkin.Controller.dto.Reservation;
import com.checkin.Controller.dto.ReservationUpdateRequest;
import com.checkin.integration.ReservationRestfulClient;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClient restClient;
	


	@RequestMapping("/showCheckIn")
	public String startCheckIn() {
		return "startCheckin";
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") Long id, ModelMap model) {
		Reservation reservation = restClient.findReservation(id);
		model.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	
	@RequestMapping("/proceedToCheckIn")
	public String proceedToCheckIn(@RequestParam("id") long id, @RequestParam("noOfBags") int noOfBags,ModelMap model) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNoOfBags(noOfBags);
		request.setCheckenIn(true);
		restClient.updateReservation(request);
		model.addAttribute("request", request);
		return "confirmReservation";
	}
	
}
