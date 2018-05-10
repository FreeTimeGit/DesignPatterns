package com.designpatterns.calculator;

public class PolandCalculator implements Calculator{

    private double zusAmount;
    private int taxPercentage;
    private CalculatorPolicy calculatorPolicy;

    public PolandCalculator(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;
        zusAmount = 1000;
        taxPercentage = 20;
    }

    public double calculate(double amount) {
        double newAmount = (amount - zusAmount)-(amount - zusAmount)*(taxPercentage/100);
        return calculatorPolicy.calulate(newAmount);
    }

    public void setCalculatorPolicy(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;
    }
}
