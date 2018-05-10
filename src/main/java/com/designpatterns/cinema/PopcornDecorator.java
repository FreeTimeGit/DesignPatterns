package com.designpatterns.cinema;

public class PopcornDecorator implements Movie{

    private Movie movie;
    private double price = 8;

    public PopcornDecorator(Movie movie) {
        this.movie = movie;
    }

    public double calculatePriceBeforeDiscount() {
        return movie.calculatePriceBeforeDiscount()+this.price;


    }
}
