package com.lecalculateur.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculatorService {

    public double basicCalculation(double operand1, double operand2, String operation) {
        switch (operation) {
            case "add":
                return operand1 + operand2;
            case "subtract":
                return operand1 - operand2;
            case "multiply":
                return operand1 * operand2;
            case "divide":
                if(operand2 == 0) throw new IllegalArgumentException("Cannot divide by zero");
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    public double calculateSin(double value) {
        return Math.sin(value);
    }

    public double calculateCos(double value) {
        return Math.cos(value);
    }

    public double calculateTan(double value) {
        return Math.tan(value);
    }

    public double calculateLog(double value) {
        return Math.log(value);
    }

}
