package com.kodilla.good.patterns.foodtodoor;

import java.util.Map;

public interface Producer {

    Map<Product, Double> getProducerStock();

    String getProducerName();

    boolean process(Order order);

    boolean equals(Object o);
    int hashCode();


}
