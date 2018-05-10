package com.designpatterns.cinema;

public class Avengers implements Movie {

    private double price = 20;

    public double calculatePriceBeforeDiscount() {
        return this.price;
    }
}
