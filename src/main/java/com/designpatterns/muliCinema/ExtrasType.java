package com.designpatterns.muliCinema;

public enum ExtrasType {
    COLA(8),
    POPCORN(10),
    NACHOS(6),
    EXIT(0);

    private double price;

    ExtrasType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
