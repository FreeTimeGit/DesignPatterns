package com.designpatterns.muliCinema;

import java.util.HashMap;

public interface Movie {

    double getPrice();
    HashMap<ExtrasType, Integer> getExtrasMap();
    String getTitle();
    void addExtrasToTicket(ExtrasType extrasType);
}
