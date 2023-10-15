package com.lecalculateur.service;

import com.lecalculateur.model.BaseConversionRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BaseConverterService {

    public String convertBase(BaseConversionRequest request) {
        int baseFrom = baseToInt(request.getFromBase());
        int baseTo = baseToInt(request.getToBase());

        // Convertir la valeur en un entier en base 10
        int decimalValue = Integer.parseInt(request.getValue(), baseFrom);

        // Convertir l'entier en base 10 vers la base cible
        return Integer.toString(decimalValue, baseTo).toUpperCase();  // .toUpperCase() pour la cohérence hexadécimale
    }

    private int baseToInt(String base) {
        switch (base.toLowerCase()) {
            case "binary":
                return 2;
            case "octal":
                return 8;
            case "decimal":
                return 10;
            case "hexadecimal":
                return 16;
            default:
                throw new IllegalArgumentException("Base non reconnue: " + base);
        }
    }
}
