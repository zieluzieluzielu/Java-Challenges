package com.kodilla.good.patterns.foodtodoor;

class Order {
    private Producer producer;
    private Product product;
    private Double amount;

    Order(Producer producer, Product product, Double amount) {
        this.producer = producer;
        this.product = product;
        this.amount = amount;
    }

    Producer getProducer() {
        return producer;
    }

    Product getProduct() {
        return product;
    }

    Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return producer + " " + product + " " + amount;
    }
}
