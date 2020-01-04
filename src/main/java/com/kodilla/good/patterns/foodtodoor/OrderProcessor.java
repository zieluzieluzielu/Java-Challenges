package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;

class OrderProcessor {

    private ArrayList<Order> orderList = new ArrayList<Order>();

    void process(Order order) {
        Producer producer = order.getProducer();
        Product product = order.getProduct();
        Double amount = order.getAmount();
        if (producer.getProducerStock().get(product) >= amount) {
            System.out.println("Order to " + producer + ":\n" + product + " [" + amount + "] was successfully processed.\n");
            orderList.add(order);
        } else
            System.out.println("Order to " + producer + ":\nOrder of " + product + " [" + amount + "] can't be processed. Producer has only " + producer.getProducerStock().get(product) + " of " + product + ".\n");
    }

    @Override
    public String toString() {
        return "OrderProcessor{" +
                "orderList=" + orderList +
                '}';
    }

    void getOrderList() {
        System.out.println("List of successfull orders:\n" + orderList);
    }
}
