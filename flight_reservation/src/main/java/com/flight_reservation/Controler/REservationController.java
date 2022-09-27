package com.flight_reservation.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation.DTO.ReservationRequest;
import com.flight_reservation.Entities.Reservation;
import com.flight_reservation.Services.ReservtionSevice;
import com.flight_reservation.utilities.PDFGenerator;

@Controller
public class REservationController {
	
	@Autowired
	private ReservtionSevice reserveService;
	
	@RequestMapping("/reserveFlight")
	public String reserveFlight(ReservationRequest request, ModelMap model) {
		Reservation reservationId = reserveService.reserveFlight(request);
		model.addAttribute("reservationId", reservationId);
		
		return "confirmReservation";
	}

}
