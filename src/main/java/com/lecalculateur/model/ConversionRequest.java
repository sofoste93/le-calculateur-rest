package com.lecalculateur.model;

public class ConversionRequest {

    private Double value; // valeur à convertir
    private String fromUnit; // l'unité actuelle
    private String toUnit; // l'unité à laquelle convertir

    public ConversionRequest() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }
}
