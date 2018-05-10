package com.designpatterns.cinema;

import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) {

        MovieApp movieApp = new MovieApp();
        movieApp.buyTicket();

    }

    private Movie movie;
    private DiscountConditionChecker discountConditionChecker;
    private MovieFactory movieFactory = MovieFactory.getInstance();
    private DiscountFactory discountFactory = DiscountFactory.getInstance();
    private double finalPrice;

    public void buyTicket() {
        movieMenu();
        selectMovie();
        addExtrasToMovie();
        countFinalPrice();

        System.out.println("Cena przed rabatem" + movie.calculatePriceBeforeDiscount());
        System.out.println("Cena po rabacie" + finalPrice);

    }

    private void countFinalPrice() {
        Discount discount = discountFactory.createDiscount(discountConditionChecker);
        finalPrice = discount.calculatePriceAfterDiscount(movie);
    }

    private void selectMovie() {
        int movieChoice = userChoiceByInt();
        movie = movieFactory.chooseMovie(movieChoice);
    }

    private void addExtrasToMovie() {
        discountConditionChecker = new DiscountConditionChecker();
        extrasMenu();
        int extrasChoice = userChoiceByInt();
        while (extrasChoice != 4) {
            switch (extrasChoice) {
                case 1:
                    movie = new PopcornDecorator(movie);
                    discountConditionChecker.setPopcorn();
                    break;
                case 2:
                    movie = new ColaDecorator(movie);
                    discountConditionChecker.setCola();
                    break;
                case 3:
                    movie = new NachosDecorator(movie);
                    discountConditionChecker.setNachos();
                    break;
            }
            extrasMenu();
            extrasChoice = userChoiceByInt();
        }
    }

    private void movieMenu() {
        System.out.println("Welcome in the cinema !");
        System.out.println("Please choose movies:");
        System.out.println("1. Avengers");
        System.out.println("2. Saw 10");
        System.out.println("3. X-men");
    }

    private void extrasMenu() {
        System.out.println("Choose your extras;");
        System.out.println("1. Popcorn");
        System.out.println("2. Cola");
        System.out.println("3. Nachos");
        System.out.println("4. NO ExtrasType!");
    }

    private int userChoiceByInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
