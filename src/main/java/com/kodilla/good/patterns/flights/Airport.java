package com.kodilla.good.patterns.flights;

public class Airport {
    private String Airport;

    Airport(String airport) {
        Airport = airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return Airport != null ? Airport.equals(airport.Airport) : airport.Airport == null;
    }

    @Override
    public int hashCode() {
        return Airport != null ? Airport.hashCode() : 0;
    }

    @Override
    public String toString() {
        return Airport;
    }
}
