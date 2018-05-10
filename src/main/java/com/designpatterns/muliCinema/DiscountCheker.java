package com.designpatterns.muliCinema;

import java.util.HashMap;
import java.util.List;

public class DiscountCheker {

    boolean checkDiscountForExtras(HashMap<ExtrasType, Integer> extras) {
        return (extras.get(ExtrasType.POPCORN) >= 1 && extras.get(ExtrasType.COLA) >= 1 && extras.get(ExtrasType.NACHOS) >= 1);
    }

    boolean checkDiscountForTickets(List list){
        return list.size()>=4;
    }

}
