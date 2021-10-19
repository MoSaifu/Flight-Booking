package com.cg.flightBooking.repository;

import com.cg.flightBooking.model.ScheduledFlight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ScheduledFlightRepository extends CrudRepository<ScheduledFlight, BigInteger>{

}
