package com.kodilla.good.patterns.foodtodoor;


public class Main {

    public static void main(String[] args) {
        Carrefour carrefour1 = new Carrefour("Lodz");
        Lidl lidl1 = new Lidl("Warsaw", 13);
        ProductStock productStock = new ProductStock();
        Product eggs = productStock.getEggs();
        Product milk = productStock.getMilk();
        Product coffee = productStock.getCoffee();
        OrderProcessor orderProcessor = new OrderProcessor();

        carrefour1.addProductToStock(eggs, 10.0);
        carrefour1.addProductToStock(milk, 10.0);

        Order order1 = new Order(carrefour1, eggs, 10.0);
        Order order2 = new Order(lidl1, milk, 15.0);
        Order order3 = new Order(lidl1, coffee, 5.0);

        orderProcessor.process(order1);
        orderProcessor.process(order2);
        orderProcessor.process(order3);

        orderProcessor.getOrderList();


    }
}
