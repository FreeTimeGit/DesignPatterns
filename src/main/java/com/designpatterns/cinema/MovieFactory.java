package com.designpatterns.cinema;

public class MovieFactory {

    private static MovieFactory movieFactory = null;

    private MovieFactory(){

    }
    public static MovieFactory getInstance(){
        if(movieFactory == null){
            return movieFactory = new MovieFactory();
        }
        else return movieFactory;
    }

    public Movie chooseMovie(int movieNumber){
        switch (movieNumber){
            case 1:
                return new Avengers();
            case 2:
                return new Saw10();
            case 3:
                return new Xmen();
        }
        throw new RuntimeException("You didn't choose right number");
    }


}
