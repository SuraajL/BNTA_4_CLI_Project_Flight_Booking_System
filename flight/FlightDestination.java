package com.bntaairport.flight;

public enum FlightDestination {

    SPAIN(1),
    FRANCE(2),
    AUSTRALIA(3),
    IRELAND(4),
    NORWAY(5);

    private final int flightNumber;

    FlightDestination(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }
}

