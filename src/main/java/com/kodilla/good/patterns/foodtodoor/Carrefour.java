package com.kodilla.good.patterns.foodtodoor;

import java.util.HashMap;
import java.util.Map;

public class Carrefour implements Producer {
    private String city;
    private String producerName = "Carrefour";

    private HashMap<Product, Double> productMap = new HashMap<>();

    Carrefour(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return producerName + "(" + city + ")";
    }


    @Override
    public Map<Product, Double> getProducerStock() {
        return productMap;
    }

    @Override
    public void addProductToStock(Product product, Double amount) {
        productMap.put(product, amount);
    }

}
