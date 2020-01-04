package com.kodilla.good.patterns.foodtodoor;

class ProductStock {
    private Product eggs = new Product("Eggs");
    private Product milk = new Product("Milk");
    private Product coffee = new Product("Coffee");

    Product getEggs() {
        return eggs;
    }

    Product getMilk() {
        return milk;
    }

    Product getCoffee() {
        return coffee;
    }
}
