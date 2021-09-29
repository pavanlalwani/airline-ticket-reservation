package com.org.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.dao.BookingDao;
import com.org.exceptions.RecordAlreadyPresentException;
import com.org.exceptions.RecordNotFoundException;
import com.org.model.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	/*
	 * Creating DAO object
	 */
	@Autowired
	BookingDao bookingDao;

	@Override
	public ResponseEntity<Booking> createBooking(Booking newBooking) {
		bookingDao.save(newBooking);
		return new ResponseEntity<Booking>(newBooking, HttpStatus.OK);
		}

	@Override
	public Booking updateBooking(Booking changedBooking) {
		bookingDao.save(changedBooking);
		return changedBooking;
		
	}

	@Override
	public String deleteBooking(Long bookingId) {

		bookingDao.deleteById(bookingId);
		return "Booking Deleted!!";
	}

	@Override
	public Iterable<Booking> displayAllBooking() {

		return bookingDao.findAll();
	}

	@Override
	public ResponseEntity<?> findBookingById(Long bookingId) {
		Optional<Booking> findById = bookingDao.findById(bookingId);
				Booking findBooking = findById.get();
				return new ResponseEntity<Booking>(findBooking, HttpStatus.OK);
	}
}
