package com.kodilla.good.patterns.foodtodoor;


public class Main {

    public static void main(String[] args) {
        Producer carrefour = new Carrefour("Lodz");
        Producer lidl = new Lidl("Warsaw");

        ProductStock productStock = new ProductStock();
        Product eggs = productStock.getEggs();
        Product milk = productStock.getMilk();
        Product coffee = productStock.getCoffee();
        OrderProcessor orderProcessor = new OrderProcessor();

        Order order1 = new Order(carrefour, eggs, 10.0);
        Order order2 = new Order(lidl, milk, 15.0);
        Order order3 = new Order(carrefour, coffee, 5.0);

        orderProcessor.process(order1);

        orderProcessor.process(order2);
        orderProcessor.process(order3);

        orderProcessor.sucessfulOrders();

        orderProcessor.unSucessfulOrders();


    }
}
