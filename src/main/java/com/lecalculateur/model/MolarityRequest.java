package com.lecalculateur.model;

public class MolarityRequest {
    private Double soluteAmount; // en moles
    private Double solutionVolume; // en litres
    private String compoundFormula; // Formule chimique pour le calcul de la masse molaire
    private Double initialConcentration; // pour les calculs de dilution
    private Double finalConcentration; // pour les calculs de dilution
    private Double dilutionVolume; // Volume souhaité de la nouvelle solution

    public MolarityRequest() {
    }
    // Vous pourriez ajouter des validations ici pour vous assurer que les valeurs appropriées sont fournies en fonction du calcul effectué.
    public boolean isValidForMolarity() {
        return soluteAmount != null && solutionVolume != null && soluteAmount >= 0 && solutionVolume > 0;
    }

    public boolean isValidForMolarMass() {
        // La validation de la formule chimique peut être complexe, nécessitant l'analyse de la formule.
        // Ici, nous vérifions simplement si quelque chose est fourni.
        return compoundFormula != null && !compoundFormula.trim().isEmpty();
    }

    public boolean isValidForDilution() {
        return initialConcentration != null && finalConcentration != null && dilutionVolume != null
               && initialConcentration > 0 && finalConcentration > 0 && dilutionVolume > 0
               && initialConcentration > finalConcentration; // La concentration initiale doit être supérieure à la concentration finale pour la dilution.
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
