package com.designpatterns.muliCinema;

import java.util.Collections;

public class MovieFactory {

    Movie movie;

    public Movie getMovie(int choice){
        switch (choice){
            case 1:
                return new Avengers("Avengers");
            case 2:
                return Thor.ThorBuilder.builder()
                        .title("Thor - Ragnarok")
                        .price(22)
                        .build();
            case 3:
                return new Xmen("X-men");
        }
        throw new RuntimeException("Niewłaściwy wybór");
    }
}
