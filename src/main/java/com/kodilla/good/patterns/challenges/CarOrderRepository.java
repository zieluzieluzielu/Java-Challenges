package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CarOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Item item, Integer amount, LocalDateTime orderDate) {
        System.out.println("[ Order creation ]\nUser: " + user + " | " + item + " | Amount: " + amount + " | Order date: " + orderDate);

    }

    public void countPrice(OrderRequest orderRequest) {
        PriceCounter priceCounter = new PriceCounter();
        System.out.println("Total price : " + priceCounter.getPrice(orderRequest.getItem()) +"USD | Total price with TAX: " + priceCounter.getPriceWithTax(orderRequest.getItem()) + " USD\n");
    }
}
