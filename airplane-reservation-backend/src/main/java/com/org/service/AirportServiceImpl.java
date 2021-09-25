package com.org.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.AirportDao;
import com.org.exceptions.RecordAlreadyPresentException;
import com.org.exceptions.RecordNotFoundException;
import com.org.models.Airport;

@Service
public class AirportServiceImpl implements AirportService {
	@Autowired
	AirportDao airportDao;


	public Iterable<Airport> viewAllAirport() {
		return airportDao.findAll();
	}


	public Airport viewAirport(String airportCode) {
		Optional<Airport> findById = airportDao.findById(airportCode);
		if (findById.isPresent()) {
			return findById.get();
		} else
			throw new RecordNotFoundException("Airport with airport code: " + airportCode + "not exists");
	}

	public void addAirport(Airport airport) {
		Optional<Airport> findById = airportDao.findById(airport.getAirportCode());
		if (!findById.isPresent()) {
			airportDao.save(airport);
		} else
			throw new RecordAlreadyPresentException(
					"Airport with code : " + airport.getAirportCode() + " already present");
	}


	public void modifyAirport(Airport airport) {
		Optional<Airport> findById = airportDao.findById(airport.getAirportCode());
		if (findById.isPresent()) {
			airportDao.save(airport);
		} else
			throw new RecordNotFoundException("Airport with code: " + airport.getAirportCode() + " not exists");
	}


	public void removeAirport(String airportCode) {
		Optional<Airport> findById = airportDao.findById(airportCode);
		if (findById.isPresent()) {
			airportDao.deleteById(airportCode);
		} else
			throw new RecordNotFoundException("Airport with code: " + airportCode + " not exists");

	}
}
