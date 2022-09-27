package com.flight_reservation.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation.DTO.ReservationRequest;
import com.flight_reservation.Entities.Flight;
import com.flight_reservation.Entities.Passenger;
import com.flight_reservation.Entities.Reservation;
import com.flight_reservation.Repository.FlightRepository;
import com.flight_reservation.Repository.PassengerRepository;
import com.flight_reservation.Repository.ReservationRepository;
import com.flight_reservation.utilities.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservtionSevice {

	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private FlightRepository flightRepo;
	@Autowired
	private ReservationRepository reservationRepo;
	@Autowired
	private PDFGenerator pdfGenerator;
	
	@Override
	public Reservation reserveFlight(ReservationRequest request) {
		
		
		
		Passenger passenger = new Passenger();
		passenger.setName(request.getName());
		passenger.setEmail(request.getEmail());
		passenger.setMobile(request.getMobile());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckenIn(false);
		reservation.setNoOfBags(0);
		String filePath="E:\\AKSHAY PSA\\spring boot projects\\springboot 4.8.0\\sts-4.8.0.RELEASE\\flight_reservation\\Tickets\\reservation"+reservation.getId()+".pdf";
		reservationRepo.save(reservation);
		pdfGenerator.generateItinenarary(reservation, filePath);
//		emailUtil.sendItinenary(p.getEmail(), filePtah);
		
		return reservation;
	}

}
