package com.designpatterns.carDecorator;

public class TempomatDecorator implements CarModel {

    private CarModel carModel;

    public TempomatDecorator(CarModel carModel) {
        this.carModel = carModel;
    }

    public void addFeatures() {
        carModel.addFeatures();
        System.out.println("Added tempomat");
    }
}
