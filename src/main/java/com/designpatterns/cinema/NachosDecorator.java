package com.designpatterns.cinema;

public class NachosDecorator implements Movie {

    private Movie movie;
    private double price = 7;

    public NachosDecorator(Movie movie) {
        this.movie = movie;
    }

    public double calculatePriceBeforeDiscount() {
        return movie.calculatePriceBeforeDiscount()+this.price;
    }
}
