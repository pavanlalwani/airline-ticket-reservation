package com.org.models;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger bookingId;
	private String departDate;
	private String sourceAirport;
	private String destinationAirport;
	private int noOfPassengers;

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
	public String getDepartDate() {
		return departDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public String getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", departDate=" + departDate + ", sourceAirport=" + sourceAirport
				+ ", destinationAirport=" + destinationAirport + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
	
}
