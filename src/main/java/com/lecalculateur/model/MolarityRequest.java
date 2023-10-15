package com.lecalculateur.model;

public class MolarityRequest {
    private Double soluteAmount; // en moles
    private Double solutionVolume; // en litres

    public MolarityRequest() {
    }

    public Double getSoluteAmount() {
        return soluteAmount;
    }

    public void setSoluteAmount(Double soluteAmount) {
        this.soluteAmount = soluteAmount;
    }

    public Double getSolutionVolume() {
        return solutionVolume;
    }

    public void setSolutionVolume(Double solutionVolume) {
        this.solutionVolume = solutionVolume;
    }
}
