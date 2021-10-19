package com.cg.flightBooking.service;

import com.cg.flightBooking.model.Booking;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;


public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
}
