package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, Item item, Integer amount, LocalDateTime orderDate);

    void countPrice(OrderRequest orderRequest);
}
