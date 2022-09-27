package com.flight_reservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation.Entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
