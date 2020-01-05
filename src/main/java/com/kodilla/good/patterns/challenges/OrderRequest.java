package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Item item;
    private Integer amount;
    private LocalDateTime orderDate;

    OrderRequest(User user, Item item, Integer amount, LocalDateTime orderDate) {
        this.user = user;
        this.item = item;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    Item getItem() {
        return item;
    }

    Integer getAmount() {
        return amount;
    }

    LocalDateTime getOrderDate() {
        return orderDate;
    }
}
