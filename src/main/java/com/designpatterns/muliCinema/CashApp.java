package com.designpatterns.muliCinema;

public class CashApp {

    public static void main(String[] args) {

        CashApp cashApp = new CashApp();

    }

    public CashApp() {

        Bill bill = Bill.getInstance();

        System.out.println("Welcome to the cinema!");

        bill.moviesChoice();

        bill.addExtrasToMovies();

        bill.printBill();

    }
}
