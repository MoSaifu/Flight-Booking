package com.cg.flightBooking.repository;

import com.cg.flightBooking.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, BigInteger> {

}
