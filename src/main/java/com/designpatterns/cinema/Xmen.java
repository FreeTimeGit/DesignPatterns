package com.designpatterns.cinema;

public class Xmen implements Movie {

    private double price = 22;

    public double getPrice() {
        return price;
    }

    public double calculatePriceBeforeDiscount() {
        return this.price;
    }
}
