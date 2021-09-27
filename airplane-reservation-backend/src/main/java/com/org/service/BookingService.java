package com.org.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.org.models.Booking;
import com.org.models.Flight;

public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
	
	public Booking viewBooking(BigInteger bookingId);
}
