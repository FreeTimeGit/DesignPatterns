package com.designpatterns.carDecorator;

public class LedLightsDecorator implements CarModel {

    private CarModel carModel;

    public LedLightsDecorator(CarModel carModel) {
        this.carModel = carModel;
    }

    public void addFeatures() {
        carModel.addFeatures();
        System.out.println("Added led lights");
    }
}
