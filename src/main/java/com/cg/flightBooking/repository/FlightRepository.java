package com.cg.flightBooking.repository;

import com.cg.flightBooking.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface FlightRepository extends CrudRepository<Flight,BigInteger>{

}
