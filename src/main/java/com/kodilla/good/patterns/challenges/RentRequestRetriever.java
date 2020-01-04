package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

class RentRequestRetriever {

    RentRequest retrieve() {
        User user = new User("Mark", "Hamill", "m.hamill@yahoo.com", "+485001234668");
        Item item = new Car("Audi", "TT", 2018);
        LocalDateTime rentFrom = LocalDateTime.of(2019, 12, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2019, 12, 12, 20, 0);

        return new RentRequest(user, item, rentFrom, rentTo);

    }
}
