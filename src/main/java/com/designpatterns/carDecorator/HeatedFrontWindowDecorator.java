package com.designpatterns.carDecorator;

public class HeatedFrontWindowDecorator implements CarModel {

    private CarModel carModel;

    public HeatedFrontWindowDecorator(CarModel carModel) {
        this.carModel = carModel;
    }

    public void addFeatures() {
        carModel.addFeatures();
        System.out.println("Added heated front window");
    }
}
