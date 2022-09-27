package com.checkin.integration;


import org.springframework.web.bind.annotation.RequestBody;

import com.checkin.Controller.dto.Reservation;
import com.checkin.Controller.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);

}
