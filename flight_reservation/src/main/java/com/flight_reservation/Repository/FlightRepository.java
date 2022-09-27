package com.flight_reservation.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation.Entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where departCity=:departureCity and arrivCity=:arrivalCity and departureDate=:dateOfDeparture")
	List<Flight> findFlight(@Param("departureCity")String from, @Param("arrivalCity") String to,  @Param("dateOfDeparture") Date departureDate);

}
