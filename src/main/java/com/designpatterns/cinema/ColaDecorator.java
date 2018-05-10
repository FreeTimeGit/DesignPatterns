package com.designpatterns.cinema;

public class ColaDecorator implements Movie {

    private Movie movie;
    private double price = 6;

    public ColaDecorator(Movie movie) {
        this.movie = movie;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePriceBeforeDiscount() {
        return movie.calculatePriceBeforeDiscount() + this.price;
    }
}
