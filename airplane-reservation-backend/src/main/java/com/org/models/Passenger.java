package com.org.models;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	private BigInteger passengerNumber;
	private String passengerName;
	private int passengerAge;
	private BigInteger passengerUIN;
	private Double luggage;

	public BigInteger getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(BigInteger passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public BigInteger getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(BigInteger passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public Double getLuggage() {
		return luggage;
	}

	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}

	public Passenger(BigInteger passengerNumber, String passengerName, int passengerAge, BigInteger passengerUIN,
			Double luggage) {
		super();
		this.passengerNumber = passengerNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}
	
	public Passenger() {
		
	}
}


