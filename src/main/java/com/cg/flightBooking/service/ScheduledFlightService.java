package com.cg.flightBooking.service;

import com.cg.flightBooking.exception.RecordNotFoundException;
import com.cg.flightBooking.exception.ScheduledFlightNotFoundException;
import com.cg.flightBooking.model.ScheduledFlight;

import java.math.BigInteger;


public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
	// boolean cancelBookings(BigInteger flightId) throws RecordNotFoundException;

}
