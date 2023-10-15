package com.lecalculateur.service;

import com.lecalculateur.model.OhmsLawRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OhmsLawService {

    public double calculateMissingValue(OhmsLawRequest request) {
        // V = I * R
        if (request.getVoltage() == null) {
            return request.getCurrent() * request.getResistance();
        }

        // I = V / R
        if (request.getCurrent() == null) {
            return request.getVoltage() / request.getResistance();
        }

        // R = V / I
        if (request.getResistance() == null) {
            return request.getVoltage() / request.getCurrent();
        }

        throw new IllegalArgumentException("Un des paramètres doit être null pour effectuer un calcul.");
    }
}
