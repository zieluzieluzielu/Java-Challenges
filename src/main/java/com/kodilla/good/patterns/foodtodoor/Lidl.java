package com.kodilla.good.patterns.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class Lidl implements Producer {
    ProductStock productStock = new ProductStock();
    String city;
    String producerName = "Lidl";
    Integer shopNumber;

    private HashMap<Product, Double> productMap = new HashMap<>();

    Lidl(String city, Integer shopNumber) {
        this.city = city;
        this.shopNumber = shopNumber;
    }

    @Override
    public String toString() {

        return producerName + "(" + city + " #" + shopNumber + ")";
    }

    @Override
    public Map<Product, Double> getProducerStock() {
        Map<Product, Double> producerStock = new HashMap<>();
        producerStock.put(productStock.getEggs(), 6.0);
        producerStock.put(productStock.getMilk(), 2.0);
        producerStock.put(productStock.getCoffee(), 20.0);
        return producerStock;
    }

    @Override
    public void addProductToStock(Product product, Double amount) {
        productMap.put(product, amount);
    }



}
