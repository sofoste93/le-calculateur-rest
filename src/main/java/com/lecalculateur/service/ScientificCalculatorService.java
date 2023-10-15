package com.lecalculateur.service;

import com.lecalculateur.model.ScientificCalculationRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ScientificCalculatorService {

    public Double calculate(ScientificCalculationRequest request) {
        switch (request.getOperation()) {
            case "sin":
                return Math.sin(request.getOperand1());
            case "cos":
                return Math.cos(request.getOperand1());
            case "tan":
                return Math.tan(request.getOperand1());
            case "log":
                return Math.log(request.getOperand1());
            // ... autres opérations scientifiques
            default:
                throw new IllegalArgumentException("Invalid operation: " + request.getOperation());
        }
    }
}