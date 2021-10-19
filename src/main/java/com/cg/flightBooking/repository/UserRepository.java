package com.cg.flightBooking.repository;

import com.cg.flightBooking.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UserRepository extends CrudRepository<Users, BigInteger>{

}