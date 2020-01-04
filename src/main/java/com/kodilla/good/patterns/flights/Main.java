package com.kodilla.good.patterns.flights;

public class Main {

    public static void main(String[] args) {
        Airport mxn = new Airport("MXN");
        Airport bxl = new Airport("BXL");
        Airport ztm = new Airport("ZTM");
        Airport pln = new Airport("PLN");

        FlightList flightList = new FlightList();
        FlightFinder flightFinder = new FlightFinder();

        flightFinder.findFlightFrom(ztm, flightList.flightList());

        flightFinder.findFlightTo(pln, flightList.flightList());

        flightFinder.findDirectFlight(mxn, bxl, flightList.flightList());
        flightFinder.findDirectFlight(bxl, bxl, flightList.flightList());

        flightFinder.findIndirectFlight(pln, mxn, flightList.flightList());
        flightFinder.findIndirectFlight(ztm, ztm, flightList.flightList());

    }
}