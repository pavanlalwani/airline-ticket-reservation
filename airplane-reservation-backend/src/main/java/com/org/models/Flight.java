package com.org.models;

import java.math.BigInteger;
import java.util.Objects;

import javax.persistence.Id;

public class Flight {

	@Id
	private BigInteger flightNo;
	private String carrierName;
	private String flightModel;
	private int seatCapacity;
	
	public Flight() {
		
	}
	
	public BigInteger getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(BigInteger flightNo) {
		this.flightNo = flightNo;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public Flight(BigInteger flightNo, String carrierName, String flightModel, int seatCapacity) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(carrierName, flightModel, flightNo, seatCapacity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(carrierName, other.carrierName) && Objects.equals(flightModel, other.flightModel)
				&& Objects.equals(flightNo, other.flightNo) && seatCapacity == other.seatCapacity;
	}

}
