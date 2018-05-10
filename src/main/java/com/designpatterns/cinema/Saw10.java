package com.designpatterns.cinema;

public class Saw10 implements Movie {

    private double price = 18;

    public double getPrice() {
        return price;
    }

    public double calculatePriceBeforeDiscount() {
        return this.price;
    }
}
