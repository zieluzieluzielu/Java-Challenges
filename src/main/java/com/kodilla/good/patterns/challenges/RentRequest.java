package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequest {

    private User user;
    private LocalDateTime rentFrom;
    private LocalDateTime rentTo;
    private Item item;

    RentRequest(User user, Item item, LocalDateTime rentFrom, LocalDateTime rentTo) {
        this.user = user;
        this.rentFrom = rentFrom;
        this.rentTo = rentTo;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    Item getItem() {
        return item;
    }

    LocalDateTime getFrom() {
        return rentFrom;
    }

    LocalDateTime getTo() {
        return rentTo;
    }

}
