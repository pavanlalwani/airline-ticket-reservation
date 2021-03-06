package com.org;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.org.dao.FlightDao;
import com.org.model.Flight;
import com.org.service.FlightService;

@SpringBootTest
public class AddFlightDetailsTest {

	
	@Autowired
	private FlightService flightService;
	
	@MockBean
	private FlightDao dao;
	

	@Test
	public void testAddFlightDetails() {
		
		Flight flightObj = new Flight(BigInteger.valueOf(657),
				"Indigo","A330", 260);
		
		
	
		flightService.addFlight(flightObj);
		when(dao.save(flightObj)).thenReturn(flightObj);
		Optional<Flight> f =  dao.findById(BigInteger.valueOf(657));
		//Flight flightitr = flightService.viewFlight(BigInteger.valueOf(657));
		//String flightobj2 = flightitr.toString();
		
		assertEquals(flightObj.equals(f), f.equals(flightObj));
	}
}
