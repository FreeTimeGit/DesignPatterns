package com.designpatterns.pizzeria;

import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory = PizzaFactory.getInstance();

        System.out.println("Please choose pizza from our menu:");
        System.out.println("1. Margherita ");
        System.out.println("2. Hawaii");
        System.out.println("3. Salami");
        System.out.println("4. Capriciosa");
        Scanner in = new Scanner(System.in);
        Pizza pizza = pizzaFactory.createPizza(in.nextInt());
        pizza.showIngredients();
    }
}
