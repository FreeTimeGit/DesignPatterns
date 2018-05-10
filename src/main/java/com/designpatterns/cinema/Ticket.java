package com.designpatterns.cinema;

import java.util.List;

public class Ticket {

    private String movieTitle;
    private List<String> extrasList;

    public Ticket(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public List<String> getExtrasList() {
        return extrasList;
    }
}
