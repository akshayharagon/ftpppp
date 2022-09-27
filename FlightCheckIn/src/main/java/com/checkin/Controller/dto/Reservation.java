package com.checkin.Controller.dto;

public class Reservation {
	private long id;
	private boolean checkenIn;
	private int noOfBags;
	private Passenger passenger;
	private Flight flight;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isCheckenIn() {
		return checkenIn;
	}
	public void setCheckenIn(boolean checkenIn) {
		this.checkenIn = checkenIn;
	}
	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassnger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	

}
