package com.cg.flightBooking.repository;

import com.cg.flightBooking.model.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, String> {

}
