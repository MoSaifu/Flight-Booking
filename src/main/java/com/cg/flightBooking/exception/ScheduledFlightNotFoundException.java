package com.cg.flightBooking.exception;

public class ScheduledFlightNotFoundException extends RuntimeException {
    public ScheduledFlightNotFoundException(String s) {
        super(s);
    }
}
