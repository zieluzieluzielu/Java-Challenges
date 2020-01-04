package com.kodilla.good.patterns.flights;

public class Flight {
    private Airport from;
    private Airport to;

    Flight(Airport from, Airport to) {
        this.from = from;
        this.to = to;
    }

    Airport getFrom() {
        return from;
    }

    Airport getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (from != null ? !from.equals(flight.from) : flight.from != null) return false;
        return to != null ? to.equals(flight.to) : flight.to == null;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }
}
