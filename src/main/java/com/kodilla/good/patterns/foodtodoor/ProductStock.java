package com.kodilla.good.patterns.foodtodoor;

class ProductStock {
    Product eggs = new Product("Eggs");
    Product milk = new Product("Milk");
    Product coffee = new Product("Coffee");

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
