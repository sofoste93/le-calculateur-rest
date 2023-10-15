package com.lecalculateur.service;

import com.lecalculateur.model.MolarityRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MolarityService {
    public double calculateMolarity(MolarityRequest request) {
        // Molarité = quantité de soluté / volume de solution
        return request.getSoluteAmount() / request.getSolutionVolume();
    }
}
