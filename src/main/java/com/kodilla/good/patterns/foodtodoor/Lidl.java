package com.kodilla.good.patterns.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class Lidl implements Producer {
    private ProductStock productStock = new ProductStock();
    private String city;
    private String producerName = "Lidl";

    Lidl(String city) {
        this.city = city;
    }

    @Override
    public String getProducerName() {
        return producerName;
    }

    @Override
    public String toString() {
        return producerName + "(" + city + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lidl lidl = (Lidl) o;

        return producerName != null ? producerName.equals(lidl.producerName) : lidl.producerName == null;
    }

    @Override
    public int hashCode() {
        return producerName != null ? producerName.hashCode() : 0;
    }

    @Override
    public Map<Product, Double> getProducerStock() {
        Map<Product, Double> producerStock = new HashMap<>();
        producerStock.put(productStock.getEggs(), 7.0);
        producerStock.put(productStock.getMilk(), 2.0);
        producerStock.put(productStock.getCoffee(), 20.0);
        return producerStock;
    }

    @Override
    public boolean process(Order order) {
        Product product = order.getProduct();
        Double amount = order.getAmount();
        if (getProducerStock().get(product) >= amount) {
            System.out.println("Order to " + toString() + ":\n" + product + " [" + amount + "] was successfully processed.\n");
            return true;
        } else
            System.out.println("Order to " + toString() + ":\nOrder of " + product + " [" + amount + "] can't be processed. Producer has only " + getProducerStock().get(product) + " of " + product + ".\n");
        return false;

    }

}
