package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;

class OrderProcessor {

    private ArrayList<Order> successfulOrderList = new ArrayList<>();
    private ArrayList<Order> unSuccessfulOrderList = new ArrayList<>();

    private void addOrder(Producer producer, Order order) {
        if (producer.process(order)) {
            successfulOrderList.add(order);
        } else unSuccessfulOrderList.add(order);
    }

    void process(Order order) {
        addOrder(order.getProducer(), order);

    }

    @Override
    public String toString() {
        return "OrderProcessor{" +
                "orderList=" + successfulOrderList +
                '}';
    }

    void sucessfulOrders() {
        System.out.println("List of successful orders:\n" + successfulOrderList + "\n");
    }

    void unSucessfulOrders() {
        System.out.println("List of successful orders:\n" + unSuccessfulOrderList + "\n");
    }
}
