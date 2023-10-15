package com.lecalculateur.model;

public class BaseConversionRequest {
    private String fromBase;
    private String toBase;
    private String value;  // Nous utilisons une chaîne pour accommoder les entrées non décimales.

    // Getters et setters

    public BaseConversionRequest() {
    }

    public String getFromBase() {
        return fromBase;
    }

    public void setFromBase(String fromBase) {
        this.fromBase = fromBase;
    }

    public String getToBase() {
        return toBase;
    }

    public void setToBase(String toBase) {
        this.toBase = toBase;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
