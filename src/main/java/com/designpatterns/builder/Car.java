package com.designpatterns.builder;

import java.util.List;

public class Car {

    private String company;
    private String model;
    private double engine;
    private int year;
    private String countryOfOrigin;
    private long milleage;
    private List<String> additionalFeatures;
    private EngineType engineType;

    public Car(String company, String model, double engine, int year, String countryOfOrigin,
               long milleage, List<String> additionalFeatures, EngineType engineType) {
        this.company = company;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.countryOfOrigin = countryOfOrigin;
        this.milleage = milleage;
        this.additionalFeatures = additionalFeatures;
        this.engineType = engineType;
    }

    public static class CarBuilder{

        private String company;
        private String model;
        private double engine;
        private int year;
        private String countryOfOrigin;
        private long milleage;
        private List<String> additionalFeatures;
        private EngineType engineType;

        public static CarBuilder builder(){
            return new CarBuilder();
        }

        public CarBuilder company(String company){
            this.company = company;
            return this;
        }
        public CarBuilder model(String model){
            this.model = model;
            return this;
        }
        public CarBuilder engine(double engine){
            this.engine = engine;
            return this;
        }
        public CarBuilder year(int year){
            this.year = year;
            return this;
        }
        public CarBuilder countryOfOrigin(String countryOfOrigin){
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }
        public CarBuilder milleage(long milleage){
            this.milleage = milleage;
            return this;
        }
        public CarBuilder additionalFeatures(List<String> additionalFeatures){
            this.additionalFeatures = additionalFeatures;
            return this;
        }
        public CarBuilder engineType(EngineType engineType){
            this.engineType = engineType;
            return this;
        }
        public Car build(){
            return new Car(company, model, engine, year, countryOfOrigin, milleage, additionalFeatures, engineType);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", milleage=" + milleage +
                ", additionalFeatures=" + additionalFeatures +
                ", engineType=" + engineType +
                '}';
    }
}
