package com.lecalculateur.model;

/**
 * Class representing a base conversion request.
 * The request includes the base from which the value should be converted,
 * the base to which the value should be converted, and the value itself.
 * The base values are represented as strings to accommodate non-decimal inputs.
 */
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