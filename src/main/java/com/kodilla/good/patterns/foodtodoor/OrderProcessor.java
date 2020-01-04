package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;

class OrderProcessor {

    private ArrayList<Order> successfulOrderList = new ArrayList<Order>();
    private ArrayList<Order> unSuccessfulOrderList = new ArrayList<Order>();


    void process(Order order) {
        if (order.getProducer().getProducerName().equals("Carrefour")) {
            addOrder(order.getProducer(), order);
        }
        else if (order.getProducer().getProducerName().equals("Lidl")) {
            addOrder(order.getProducer(), order);
        }
        else {
            System.out.println("Order can't be processed. Producer not found");
        }
    }

    @Override
    public String toString() {
        return "OrderProcessor{" +
                "orderList=" + successfulOrderList +
                '}';
    }

    public void addOrder(Producer producer, Order order){
        if (producer.process(order)) {
            successfulOrderList.add(order);
        }
        else unSuccessfulOrderList.add(order);
    }

    void sucessfulOrders() {
        System.out.println("List of successful orders:\n" + successfulOrderList+"\n");
    }

    void unSucessfulOrders() {
        System.out.println("List of successful orders:\n" + unSuccessfulOrderList+"\n");
    }
}
