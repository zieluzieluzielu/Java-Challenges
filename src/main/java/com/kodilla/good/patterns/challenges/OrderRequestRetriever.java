package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

class OrderRequestRetriever {

    OrderRequest retrieve() {
        User user = new User("Mark", "Hamill", "m.hamill@yahoo.com", "+485001234668");
        Item item = new Car("Audi", "TT", 2018, 50000.99);
        Integer amount = 2;
        LocalDateTime orderDate = LocalDateTime.of(2019, 12, 1, 12, 50);

        return new OrderRequest(user, item, amount, orderDate);

    }
}
