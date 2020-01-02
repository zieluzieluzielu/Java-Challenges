package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequest {

    private User user;
    private LocalDateTime rentFrom;
    private LocalDateTime rentTo;
    private Car car;

    RentRequest(User user, Car car, LocalDateTime rentFrom, LocalDateTime rentTo) {
        this.user = user;
        this.rentFrom = rentFrom;
        this.rentTo = rentTo;
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    Car getCar() {
        return car;
    }

    LocalDateTime getFrom() {
        return rentFrom;
    }

    LocalDateTime getTo() {
        return rentTo;
    }

}
