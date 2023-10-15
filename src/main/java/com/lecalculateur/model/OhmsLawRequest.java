package com.lecalculateur.model;

public class OhmsLawRequest {
    private Double voltage; // en volts
    private Double current; // en ampères
    private Double resistance; // en ohms

    public OhmsLawRequest() {
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    public Double getResistance() {
        return resistance;
    }

    public void setResistance(Double resistance) {
        this.resistance = resistance;
    }
}
