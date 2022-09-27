package com.flight_reservation.DTO;

public class ReservationUpdaterequest {
	
	private long id;
	private boolean checkenIn;
	private int noOfBags;
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
	
	

}
