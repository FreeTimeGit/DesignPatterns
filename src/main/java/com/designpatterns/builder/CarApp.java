package com.designpatterns.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.designpatterns.builder.Car.*;

public class CarApp {

    public static void main(String[] args) {
        Car car = CarBuilder.builder()
                .company("Ford")
                .model("Mondeo")
                .engineType(EngineType.DISEL)
                .build();
        Car car1 = CarBuilder.builder()
                .company("Ford")
                .model("Mondeo")
                .engine(1.8)
                .build();
        Car car2 = CarBuilder.builder()
                .company("Ford")
                .model("Mondeo")
                .additionalFeatures(Arrays.asList("AC","Heated seats"))
                .build();

        System.out.println(car2);
    }


}
