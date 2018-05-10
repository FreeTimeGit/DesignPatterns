package com.designpatterns.muliCinema;

import java.util.HashMap;

public class Xmen implements Movie {

    private String title;
    private double price = 22;
    private HashMap<ExtrasType, Integer> extras = new HashMap<>();
    private int popcornNumber = 0;
    private int colaNumber = 0;
    private int nachosNumber = 0;

    public Xmen(String title) {
        this.title = title;
        this.extras.put(ExtrasType.COLA,colaNumber);
        this.extras.put(ExtrasType.POPCORN,popcornNumber);
        this.extras.put(ExtrasType.NACHOS,nachosNumber);
    }

    @Override
    public double getPrice() {
        double price = this.price + getExtrasPrice();
        return price;
    }

    @Override
    public HashMap<ExtrasType, Integer> getExtrasMap() {
        return this.extras;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void addExtrasToTicket(ExtrasType extrasType) {
        switch (extrasType){
            case POPCORN:
                this.extras.put(ExtrasType.POPCORN,popcornNumber+=1);
                break;
            case COLA:
                this.extras.put(ExtrasType.COLA,colaNumber+=1);
                break;
            case NACHOS:
                this.extras.put(ExtrasType.NACHOS,nachosNumber+=1);
                break;
        }
    }

    private double getExtrasPrice() {
        return (extras.get(ExtrasType.COLA) * ExtrasType.COLA.getPrice())
                + (extras.get(ExtrasType.POPCORN) * ExtrasType.POPCORN.getPrice())
                + (extras.get(ExtrasType.NACHOS) * ExtrasType.NACHOS.getPrice());
    }
}
