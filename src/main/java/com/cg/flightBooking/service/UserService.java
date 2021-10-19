package com.cg.flightBooking.service;

import com.cg.flightBooking.model.Users;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;


public interface UserService {

	public ResponseEntity<?> createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(BigInteger UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(BigInteger userId);
}