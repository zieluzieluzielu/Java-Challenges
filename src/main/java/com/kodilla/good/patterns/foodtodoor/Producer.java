package com.kodilla.good.patterns.foodtodoor;

import java.util.Map;

public interface Producer {

    Map<Product, Double> getProducerStock();

    void addProductToStock(Product product, Double amount);



}
