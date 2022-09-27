package com.flight_reservation.Services;

import com.flight_reservation.DTO.ReservationRequest;
import com.flight_reservation.Entities.Reservation;

public interface ReservtionSevice {
	Reservation reserveFlight(ReservationRequest request);

}
