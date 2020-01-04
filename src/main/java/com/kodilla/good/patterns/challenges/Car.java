package com.kodilla.good.patterns.challenges;

public class Car implements Item {

    String car;
    String model;
    Integer year;

    public Car(String car, String model, Integer year) {
        this.car = car;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car: " + car + " " + model+" ("+year+")";
    }

    public String itemDescription() {
        return car+ ", model: "+model+" which was produced in "+year;

    }

}
