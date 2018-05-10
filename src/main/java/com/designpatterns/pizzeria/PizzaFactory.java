package com.designpatterns.pizzeria;

public class PizzaFactory {

    private static PizzaFactory pizzaFactory = null;

    private PizzaFactory(){

    }

    public static PizzaFactory getInstance(){
        if(pizzaFactory == null){
            pizzaFactory = new PizzaFactory();
        }
        return pizzaFactory;
    }

    public Pizza createPizza (int pizzaNumber){
        switch (pizzaNumber){
            case 1:
                return new Margherita();
            case 2:
                return new Hawaii();
            case 3:
                return new Salami();
            case 4:
                return new Capriciosa();
        }
        throw new RuntimeException("Invalid pizza number !");
    }

}
