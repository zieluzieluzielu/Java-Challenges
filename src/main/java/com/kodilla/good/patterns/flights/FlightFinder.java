package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FlightFinder {

    private List<Flight> listOfFlightsFrom(Airport airport, ArrayList<Flight> getFlights) {
        return getFlights.stream()
                .filter(flightFrom -> airport.equals(flightFrom.getFrom()))
                .collect(Collectors.toList());
    }

    void findFlightFrom(Airport airport, ArrayList<Flight> getFlights) {
        List<Flight> listFrom = listOfFlightsFrom(airport, getFlights);
        if (listFrom.size() >= 1) {
            System.out.println("Flights from " + airport + ":\n" + listFrom + "\n");
        } else {
            System.out.println("There are no avilable flights from " + airport + ".\n");
        }
    }

    private List<Flight> listOfFlightsTo(Airport airport, ArrayList<Flight> getFlights) {
        return getFlights.stream()
                .filter(flightTo -> airport.equals(flightTo.getTo()))
                .collect(Collectors.toList());
    }

    void findFlightTo(Airport airport, ArrayList<Flight> getFlights) {
        List<Flight> listTo = listOfFlightsTo(airport, getFlights);
        if (listTo.size() >= 1) {
            System.out.println("Flights from " + airport + ":\n" + listTo + "\n");
        } else {
            System.out.println("There are no avilable flights to " + airport + ".\n");
        }
    }


    private List<Flight> listFromTo(Airport from, Airport to, ArrayList<Flight> getFlights) {
        List<Flight> listFrom = listOfFlightsFrom(from, getFlights);
        return listFrom.stream()
                .filter(flightTo -> to.equals(flightTo.getTo()))
                .collect(Collectors.toList());
    }

    void findDirectFlight(Airport from, Airport to, ArrayList<Flight> getFlights) {
        List<Flight> listFromTo = listFromTo(from, to, getFlights);
        if (listFromTo.size() >= 1) {
            System.out.println("Flights from " + from + " to " + to + ":\n" + listFromTo + "\n");
        } else {
            System.out.println("There are no available flights from " + from + " to " + to + ".\n");
        }
    }


    private List<Flight> listFromThrough(Airport from, Airport to, ArrayList<Flight> getFlights) {
        List<Flight> listFrom = listOfFlightsFrom(from, getFlights);
        List<Flight> listTo = listOfFlightsTo(to, getFlights);
        return listFrom.stream().
                filter(flightFrom -> listTo.stream()
                        .anyMatch(flightTo -> flightTo.getFrom().equals(flightFrom.getTo())))
                .collect(Collectors.toList());
    }

    private List<Flight> listToThrough(Airport from, Airport to, ArrayList<Flight> getFlights) {
        List<Flight> listFrom = listOfFlightsFrom(from, getFlights);
        List<Flight> listTo = listOfFlightsTo(to, getFlights);
        return listTo.stream().
                filter(flightTo -> listFrom.stream()
                        .anyMatch(flightFrom -> flightFrom.getTo().equals(flightTo.getFrom())))
                .collect(Collectors.toList());
    }

    void findIndirectFlight(Airport from, Airport to, ArrayList<Flight> getFlights) {
        List<Flight> listFromThrough = listFromThrough(from, to, getFlights);
        List<Flight> listToThrough = listToThrough(from, to, getFlights);

        String throughPossibilites = listToThrough.stream().
                map(n -> n.getFrom().toString()).collect(Collectors.joining(", "));

        if (listToThrough.size() >= 1) {
            System.out.println("Not direct connections from " + from + " to " + to + " are available through " + throughPossibilites + " airports:\n" + listFromThrough + "\n" + listToThrough + "\n");
        } else {
            System.out.println("Not direct connections from " + from + " to " + to + " are not available.\n");
        }

    }

}
