package com.org;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.math.BigInteger;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.org.dao.AirportDao;
import com.org.dao.FlightDao;
import com.org.model.Airport;
import com.org.model.Flight;
import com.org.model.Schedule;
import com.org.model.ScheduledFlight;
import com.org.service.AirportService;

@SpringBootTest
public class AirportTest {
	
	@Autowired
	private AirportService airportService;
	
	@MockBean
	private AirportDao dao;
	
	@Test
	public void testAddAirport() {
		Airport airport = new Airport();
		airport.setAirportCode("101");
		airport.setAirportLocation("Mumbai");
		airport.setAirportName("Mumbai Airport");
		Airport savedAirport = dao.save(airport);
		Optional<Airport> a =  dao.findById("101");
		
		assertEquals(airport.equals(a), a.equals(airport));
	}
	
	@Test
	public void testModifyAirport() {
		Airport airport = new Airport();
		airport.setAirportCode("101");
		airport.setAirportLocation("Mumbai");
		airport.setAirportName("Mumbai Airport");
		Airport savedAirport = dao.save(airport);
		Optional<Airport> a =  dao.findById("101");
		Airport newAirport = new Airport();
		newAirport = airport;
		newAirport.setAirportCode("102");
		Airport newSavedAirport = dao.save(newAirport);
		Optional<Airport> a1 =  dao.findById("102");
		
		assertEquals(newAirport.equals(a1), a1.equals(newAirport));
	}

}
