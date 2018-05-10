package com.designpatterns.cinema;

public class TicketsAmountDiscount implements Discount {

    private Movie movie;

    public double calculatePriceAfterDiscount(Movie movie) {
        return movie.calculatePriceBeforeDiscount()*0.90;
    }
}
