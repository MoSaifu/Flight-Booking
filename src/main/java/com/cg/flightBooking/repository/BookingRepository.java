package com.cg.flightBooking.repository;

import com.cg.flightBooking.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookingRepository extends CrudRepository<Booking, BigInteger> {

}
