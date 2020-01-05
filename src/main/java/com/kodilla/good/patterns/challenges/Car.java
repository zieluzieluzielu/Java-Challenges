package com.kodilla.good.patterns.challenges;

public class Car implements Item {

    private String car;
    private String model;
    private Integer year;
    private Double price;

    Car(String car, String model, Integer year, Double price) {
        this.car = car;
        this.model = model;
        this.year = year;
        this.price = price;

    }

    @Override
    public String toString() {
        return "car: " + car + " " + model + " (" + year + ")";
    }

    @Override
    public String itemDescription() {
        return car + ", model: " + model + " was produced in " + year;

    }

    @Override
    public Double price() {
        return price;
    }
}
