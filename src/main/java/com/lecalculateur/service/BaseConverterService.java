package com.lecalculateur.service;

import com.lecalculateur.model.BaseConversionRequest;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * This class provides a service for converting values from one base to another.
 */
@ApplicationScoped
public class BaseConverterService {

    /**
     * Converts a given value from one base to another.
     *
     * @param request The object containing the conversion details, including the value to be converted,
     *                the base from which to convert, and the base to which the value should be converted.
     * @return The converted value as a string in the desired base.
     */
    public String convertBase(BaseConversionRequest request) {
        int baseFrom = baseToInt(request.getFromBase());
        int baseTo = baseToInt(request.getToBase());

        // Convertir la valeur en un entier en base 10
        int decimalValue = Integer.parseInt(request.getValue(), baseFrom);

        // Convertir l'entier en base 10 vers la base cible
        return Integer.toString(decimalValue, baseTo).toUpperCase();  // .toUpperCase() pour la cohérence hexadécimale
    }

    /**
     * Returns the integer representation of the specified base.
     *
     * @param base the base to convert to integer
     * @return the integer representation of the base
     * @throws IllegalArgumentException if the base is not recognized
     */
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