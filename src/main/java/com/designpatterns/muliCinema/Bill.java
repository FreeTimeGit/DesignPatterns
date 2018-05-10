package com.designpatterns.muliCinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill {

    private static Bill bill = null;

    private Bill() {

    }

    public static Bill getInstance() {
        if (bill == null) {
            bill = new Bill();
        }
        return bill;
    }

    private List<Movie> movieList = new ArrayList<>();

    public void moviesChoice() {
        MovieFactory movieFactory = new MovieFactory();
        Scanner scanner = new Scanner(System.in);
        Movie movie;
        movieMenu();
        int movieChoice = scanner.nextInt();
        movie = movieFactory.getMovie(movieChoice);
        while (movieChoice != 4) {
            movieList.add(movie);
            movieMenu();
            movieChoice = scanner.nextInt();
            if (movieChoice != 4) {
                movie = movieFactory.getMovie(movieChoice);
            }
        }
    }

    public void addExtrasToMovies() {
        Scanner scanner = new Scanner(System.in);
        ExtrasType extrasType;
        for (Movie movie : movieList) {

            System.out.println("Please choose Extras to " + movie.getTitle());
            extrasMenu();

            int extrasChoice = scanner.nextInt();
            extrasType = ExtrasType.values()[extrasChoice - 1];

            while (extrasChoice != 4) {
                movie.addExtrasToTicket(extrasType);

                extrasMenu();
                extrasChoice = scanner.nextInt();
                extrasType = ExtrasType.values()[extrasChoice - 1];
            }
        }
    }

    private double calculateFinalPrice() {
        DiscountCheker discountCheker = new DiscountCheker();
        double finalPrice;
        double finalPriceForAll = 0;
        for (int i = 0; i < movieList.size(); i++) {
            finalPrice = calculatePriceForMovieAfterDiscount(i);
            finalPriceForAll += finalPrice;
        }
        if (discountCheker.checkDiscountForTickets(movieList)) {
            finalPriceForAll = finalPriceForAll * 0.9;
        }
        return finalPriceForAll;
    }

    private double calculatePriceForMovieAfterDiscount(int index) {
        DiscountCheker discountCheker = new DiscountCheker();
        double priceAfterDiscount = movieList.get(index).getPrice();
        if (discountCheker.checkDiscountForExtras(movieList.get(index).getExtrasMap())) {
            priceAfterDiscount = movieList.get(index).getPrice() * 0.9;
        }
        return priceAfterDiscount;
    }

    private void movieMenu() {
        System.out.println("Please choose movie:");
        System.out.println("1. Avengers");
        System.out.println("2. Thor");
        System.out.println("3. X-men");
        System.out.println("4. Exit");
    }

    private void extrasMenu() {
        System.out.println("1. Cola");
        System.out.println("2. Popcorn");
        System.out.println("3. Nachos");
        System.out.println("4. NO Extras!");
    }

    public void printBill() {
        for (int i = 0; i < movieList.size(); i++) {

            System.out.println("Kupiono bilet na: " + movieList.get(i).getTitle());
            System.out.println("Lista dodatków to:");
            System.out.println(movieList.get(i).getExtrasMap());
            System.out.println("Cena przed rabatem: " + movieList.get(i).getPrice());
            System.out.println("Cena po rabatem: " + calculatePriceForMovieAfterDiscount(i));
            System.out.println();
        }
        System.out.printf("RAZEM do zapłaty: %.2f", calculateFinalPrice());
    }
}
