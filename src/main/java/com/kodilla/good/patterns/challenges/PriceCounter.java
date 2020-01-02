package com.kodilla.good.patterns.challenges;

import java.time.Period;

class PriceCounter {

    private RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
    private RentRequest rentRequest = rentRequestRetriever.retrieve();
    private Period period = Period.between(rentRequest.getFrom().toLocalDate(), rentRequest.getTo().toLocalDate());
    private Integer daysElapsed = period.getDays();

    Integer getPeriod() {
        return daysElapsed;
    }

    double getPrice() {
        Double pricePerDay = 25.00;
        return daysElapsed* pricePerDay;
    }

}
