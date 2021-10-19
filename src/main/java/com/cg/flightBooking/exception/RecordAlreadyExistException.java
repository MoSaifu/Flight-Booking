package com.cg.flightBooking.exception;

public class RecordAlreadyExistException extends RuntimeException {
    public RecordAlreadyExistException(String s) {
        super(s);
    }
}
