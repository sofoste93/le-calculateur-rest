package com.lecalculateur.service;

import com.lecalculateur.model.MolarityRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MolarityService {
    public double calculateMolarity(ChemistryCalculationRequest request) {
        // Assurez-vous que la demande est valide
        if (!request.isValidForMolarity()) {
            throw new IllegalArgumentException("Invalid request for molarity calculation");
        }
        return request.getSoluteAmount() / request.getSolutionVolume();
    }

    public double calculateMolarMass(ChemistryCalculationRequest request) {
        // Vérifiez la validité
        if (!request.isValidForMolarMass()) {
            throw new IllegalArgumentException("Invalid request for molar mass calculation");
        }

        // Ceci est une simplification. En réalité, vous devriez analyser la formule et calculer la masse basée sur les atomes.
        // Vous pourriez avoir une carte des masses atomiques et la parcourir en fonction de la formule fournie.
        // Pour cet exemple, disons que chaque caractère représente un atome avec une masse de 1 g/mol.
        return request.getCompoundFormula().length();
    }

    public double calculateDilution(ChemistryCalculationRequest request) {
        if (!request.isValidForDilution()) {
            throw new IllegalArgumentException("Invalid request for dilution calculation");
        }

        // Calculer le volume de soluté nécessaire
        double requiredSoluteVolume = request.getInitialConcentration() * request.getDilutionVolume() / request.getFinalConcentration();
        return requiredSoluteVolume; // Cela retourne le volume de soluté à ajouter. La logique peut varier en fonction des besoins spécifiques.
    }

    /*public double calculateDilution(ChemistryCalculationRequest request) {
        // C = C1 * V1 / V2
        // Vous pourriez calculer combien de solvant à ajouter, ou le volume final, basé sur les informations fournies.
    }*/

    public double convertUnits(ChemistryCalculationRequest request) {
        // Implémentez la logique pour différentes conversions d'unités nécessaires dans les calculs chimiques.
    }
}
