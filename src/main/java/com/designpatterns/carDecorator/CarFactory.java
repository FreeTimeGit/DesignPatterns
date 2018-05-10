package com.designpatterns.carDecorator;

public class CarFactory {

    public CarModel chooseCar(int choice){
        switch (choice){
            case 1:
                return new Audi();
            case 2:
                return new Mazda();
            case 3:
                return new Opel();
        }
        throw new RuntimeException("You didn't choice any car!");
    }
}
