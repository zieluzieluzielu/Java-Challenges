package com.kodilla.good.patterns.flights;

import java.util.ArrayList;

class FlightList {

    private Airport mxn = new Airport("MXN");
    private Airport abc = new Airport("ABC");
    private Airport bxl = new Airport("BXL");
    private Airport mzn = new Airport("MZN");
    private Airport xxx = new Airport("XXX");
    private Airport ztm = new Airport("ZTM");
    private Airport pln = new Airport("PLN");


    ArrayList<Flight> flightList() {
        ArrayList<Flight> getFlights = new ArrayList<>();
        getFlights.add(new Flight(pln, abc));
        getFlights.add(new Flight(pln, xxx));
        getFlights.add(new Flight(mxn, bxl));
        getFlights.add(new Flight(abc, bxl));
        getFlights.add(new Flight(abc, mzn));
        getFlights.add(new Flight(mzn, bxl));
        getFlights.add(new Flight(ztm, bxl));
        getFlights.add(new Flight(xxx, abc));
        getFlights.add(new Flight(ztm, abc));
        getFlights.add(new Flight(ztm, mxn));
        getFlights.add(new Flight(abc, pln));
        getFlights.add(new Flight(xxx, mxn));
        getFlights.add(new Flight(bxl, mxn));
        getFlights.add(new Flight(mxn, bxl));
        getFlights.add(new Flight(abc, mxn));
        return getFlights;
    }

}
