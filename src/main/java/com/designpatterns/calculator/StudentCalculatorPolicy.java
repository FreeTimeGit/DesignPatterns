package com.designpatterns.calculator;

public class StudentCalculatorPolicy implements CalculatorPolicy {

    public double calulate(double basicSalary) {
        return basicSalary * 1.2;
    }
}
