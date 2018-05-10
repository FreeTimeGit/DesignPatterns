package com.designpatterns.calculator;

public class ForPoliticsCalculatorPolicy implements CalculatorPolicy {

    public double calulate(double basicSalary) {
        return basicSalary * 5;
    }
}
