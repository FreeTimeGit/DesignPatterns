package com.designpatterns.calculator;

public class BasicCalculatorPolicy implements CalculatorPolicy {

    public double calulate(double basicSalary) {
        return basicSalary;
    }
}
