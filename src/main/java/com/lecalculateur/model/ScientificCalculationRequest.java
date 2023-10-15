package com.lecalculateur.model;

public class ScientificCalculationRequest {
    private Double operand1;
    private Double operand2;
    private String operation; // 'sin', 'cos', 'tan', 'log', etc.

    public ScientificCalculationRequest() {
    }

    public Double getOperand1() {
        return operand1;
    }

    public void setOperand1(Double operand1) {
        this.operand1 = operand1;
    }

    public Double getOperand2() {
        return operand2;
    }

    public void setOperand2(Double operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}