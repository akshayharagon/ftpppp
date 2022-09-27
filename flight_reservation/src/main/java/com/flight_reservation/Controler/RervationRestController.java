package com.flight_reservation.Controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_reservation.DTO.ReservationUpdaterequest;
import com.flight_reservation.Entities.Reservation;
import com.flight_reservation.Repository.ReservationRepository;

@RestController
public class RervationRestController {
	
	@Autowired
	private ReservationRepository reservtionrepo;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") long id) {
		Optional<Reservation> findById = reservtionrepo.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}
	
	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdaterequest request) {
		Optional<Reservation> findById = reservtionrepo.findById(request.getId());
		Reservation reservation = findById.get();
		reservation.setCheckenIn(request.isCheckenIn());
		reservation.setNoOfBags(request.getNoOfBags());
		return reservtionrepo.save(reservation);
	}
}
