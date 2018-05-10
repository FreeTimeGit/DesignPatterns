package com.designpatterns.muliCinema;

import java.util.HashMap;

public class Thor implements Movie {

    private String title;
    private double price = 18;
    private HashMap<ExtrasType, Integer> extras = new HashMap<>();
    private int popcornNumber = 0;
    private int colaNumber = 0;
    private int nachosNumber = 0;

    public Thor(String title) {
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
                extras.put(ExtrasType.POPCORN,popcornNumber+=1);
                break;
            case COLA:
                extras.put(ExtrasType.COLA,colaNumber+=1);
                break;
            case NACHOS:
                extras.put(ExtrasType.NACHOS,nachosNumber+=1);
                break;
        }
    }

    private double getExtrasPrice() {
        return (extras.get(ExtrasType.COLA) * ExtrasType.COLA.getPrice())
                + (extras.get(ExtrasType.POPCORN) * ExtrasType.POPCORN.getPrice())
                + (extras.get(ExtrasType.NACHOS) * ExtrasType.NACHOS.getPrice());
    }
    public Thor(String title, double price, HashMap<ExtrasType, Integer> extras, int popcornNumber, int colaNumber, int nachosNumber) {
        this.title = title;
        this.price = price;
        this.extras = extras;
        this.popcornNumber = popcornNumber;
        this.colaNumber = colaNumber;
        this.nachosNumber = nachosNumber;
    }

    public static class ThorBuilder implements Movie{

        private String title;
        private double price = 22;
        private HashMap<ExtrasType, Integer> extras = new HashMap<>();
        private int popcornNumber = 0;
        private int colaNumber = 0;
        private int nachosNumber = 0;

        public static ThorBuilder builder(){
            return new ThorBuilder();
        }

        public ThorBuilder title(String title){
            this.title = title;
            return this;
        }
        public ThorBuilder price(double price){
            this.price = price;
            this.extras.put(ExtrasType.POPCORN, popcornNumber);
            this.extras.put(ExtrasType.NACHOS, nachosNumber);
            this.extras.put(ExtrasType.COLA, colaNumber);
            return this;
        }
        public ThorBuilder extras(HashMap<ExtrasType, Integer> extras){
            this.extras.put(ExtrasType.POPCORN, popcornNumber);
            this.extras.put(ExtrasType.NACHOS, nachosNumber);
            this.extras.put(ExtrasType.COLA, colaNumber);
            this.extras = extras;
            return this;
        }
        public ThorBuilder popcornNumber(int popcornNumber){
            this.popcornNumber = popcornNumber;
            return this;
        }
        public ThorBuilder nachosNumber(int nachosNumber){
            this.nachosNumber = nachosNumber;
            return this;
        }
        public ThorBuilder colaNumber(int colaNumber){
            this.colaNumber = colaNumber;
            return this;
        }

        public Thor build(){
            return new Thor(title, price, extras, popcornNumber, colaNumber, nachosNumber);
        }

        @Override
        public double getPrice() {
            return 0;
        }

        @Override
        public HashMap<ExtrasType, Integer> getExtrasMap() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void addExtrasToTicket(ExtrasType extrasType) {

        }
    }
}
