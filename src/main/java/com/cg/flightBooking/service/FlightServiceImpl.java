package com.cg.flightBooking.service;

import com.cg.flightBooking.exception.RecordAlreadyExistException;
import com.cg.flightBooking.exception.RecordNotFoundException;
import com.cg.flightBooking.model.Flight;
import com.cg.flightBooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;


@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightRepository flightReposiyory;

	/*
	 * add a flight
	 */
	@Override
	public ResponseEntity<Flight> addFlight(Flight flight) {
		Optional<Flight> findById = flightReposiyory.findById(flight.getFlightNo());
		try {
		if (!findById.isPresent()) {
			flightReposiyory.save(flight);
			return new ResponseEntity<Flight>(flight,HttpStatus.OK);
		} else
			throw new RecordAlreadyExistException("Flight with number: " + flight.getFlightNo() + " already present");
	}
		catch(RecordAlreadyExistException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * view all flights
	 */
	@Override
	public Iterable<Flight> viewAllFlight() {
		return flightReposiyory.findAll();
	}

	/*
	 * search a flight
	 */
	@Override
	public Flight viewFlight(BigInteger flightNumber) {
		Optional<Flight> findById = flightReposiyory.findById(flightNumber);
		if (findById.isPresent()) {
			return findById.get();
		}
		else
			throw new RecordNotFoundException("Flight with number: " + flightNumber + " not exists");
	}


	/*
	 * modify a flight
	 */
	@Override
	public Flight modifyFlight(Flight flight) {
		Optional<Flight> findById = flightReposiyory.findById(flight.getFlightNo());
		if (findById.isPresent()) {
			flightReposiyory.save(flight);
		} else
			throw new RecordNotFoundException("Flight with number: " + flight.getFlightNo() + " not exists");
		return flight;
	}

	/*
	 * remove a flight
	 */
	public String removeFlight(BigInteger flightNumber) {
		Optional<Flight> findById = flightReposiyory.findById(flightNumber);
		if (findById.isPresent()) {
			flightReposiyory.deleteById(flightNumber);
			return "Flight removed!!";
		} else
			throw new RecordNotFoundException("Flight with number: " + flightNumber + " not exists");

	}
}
