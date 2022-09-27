package com.flight_reservation.Entities;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight extends AbstractEntity {

	
	@Column(nullable = false, unique = true)
	private String flightNo; 
	@Column(nullable = false, unique = true)
	private String operatingAirline;
	@Column(nullable = false, unique = true)
	private String departCity;
	@Column(nullable = false, unique = true)
	private String arrivCity;
	private Date departureDate;
	private Timestamp estimatedDepartTime;
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}
	public String getDepartCity() {
		return departCity;
	}
	public void setDepartCity(String departCity) {
		this.departCity = departCity;
	}
	public String getArrivCity() {
		return arrivCity;
	}
	public void setArrivCity(String arrivCity) {
		this.arrivCity = arrivCity;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Timestamp getEstimatedDepartTime() {
		return estimatedDepartTime;
	}
	public void setEstimatedDepartTime(Timestamp estimatedDepartTime) {
		this.estimatedDepartTime = estimatedDepartTime;
	}
	
}
