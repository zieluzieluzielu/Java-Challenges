package com.kodilla.good.patterns.challenges;


class PriceCounter {

    private OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    private OrderRequest orderRequest = orderRequestRetriever.retrieve();

    double getPrice(Item item) {
        return (orderRequest.getAmount() * item.price());
    }

    double getPriceWithTax(Item item) {
        return getPrice(item)+(getPrice(item)*0.1);
    }

}
