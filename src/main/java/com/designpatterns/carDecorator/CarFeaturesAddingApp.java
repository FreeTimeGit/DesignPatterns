package com.designpatterns.carDecorator;

import java.util.Scanner;

public class CarFeaturesAddingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CarModel carModel = null;
        CarFactory carFactory = new CarFactory();

        System.out.println("Choose your car:");
        System.out.println("1. Audi");
        System.out.println("2. Mazda");
        System.out.println("3. Opel");

        int carChoice = scanner.nextInt();

        carModel = carFactory.chooseCar(carChoice);

        System.out.println("Choose you features to car:");
        System.out.println("1. Tempomat");
        System.out.println("2. Led lights");
        System.out.println("3. Heated front window");


        int featureChoice = scanner.nextInt();
        switch (featureChoice){
            case 1:
                carModel = new TempomatDecorator(carModel);
                break;
            case 2:
                carModel = new LedLightsDecorator(carModel);
                break;
            case 3:
                carModel = new HeatedFrontWindowDecorator(carModel);
        }
        carModel.addFeatures();
    }
}
