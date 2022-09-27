package com.flight_reservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
