package com.designpatterns.cinema;

public class NoDiscount implements Discount {

    public double calculatePriceAfterDiscount(Movie movie) {
        return movie.calculatePriceBeforeDiscount();
    }
}
