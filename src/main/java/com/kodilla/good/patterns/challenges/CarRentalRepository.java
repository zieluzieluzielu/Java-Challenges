package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public void createRental(User user, Item item, LocalDateTime rentFrom , LocalDateTime rentTo) {
        System.out.println("[ Creation of rental ]\nUser: "+user+ " | "+item+" | From: "+rentFrom+" | To: "+rentTo);

    }

    public void countPrice() {
        PriceCounter priceCounter = new PriceCounter();
        System.out.println("Days: "+priceCounter.getPeriod()+" | Price: "+priceCounter.getPrice()+" USD");
    }
}
