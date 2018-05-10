package com.designpatterns.strategy;

import java.util.Scanner;

public class KnightApp {

    public static void main(String[] args) {
        Knight knight = new Knight(new KillDragonQuest());
        System.out.println("Choose quest to do:");
        System.out.println("1. Default quest - kill the dragon");
        System.out.println("2. Save the queen");
        System.out.println("3. Burn the city");
        Scanner in = new Scanner(System.in);
        int quest = in.nextInt();
        switch (quest){
            case 1:
                knight.play();
                break;
            case 2:
                knight.setQuest(new SaveTheQueenQuest());
                knight.play();
                break;
            case 3:
                knight.setQuest(new BurnTheCityQuest());
                knight.play();
                break;
        }
    }
}
