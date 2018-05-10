package com.designpatterns.cinema;

public class ExtrasDiscount implements Discount {

    private Movie movie;

    public double calculatePriceAfterDiscount(Movie movie) {
        return movie.calculatePriceBeforeDiscount()*0.90;
    }
}
