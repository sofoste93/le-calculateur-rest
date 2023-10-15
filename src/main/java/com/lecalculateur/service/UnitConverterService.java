package com.lecalculateur.service;
import com.lecalculateur.model.ConversionRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UnitConverterService {

    public Double convert(ConversionRequest request) {
        switch (request.getFromUnit()) {
            case "meters":
                return convertFromMeters(request.getValue(), request.getToUnit());
            case "grams":
                return convertFromGrams(request.getValue(), request.getToUnit());
            case "liters":
                return convertFromLiters(request.getValue(), request.getToUnit());
            case "celsius":
                return convertFromCelsius(request.getValue(), request.getToUnit());
            case "km/h":
                return convertFromKmPerHour(request.getValue(), request.getToUnit());
            // ... autres cas
            default:
                throw new IllegalArgumentException("Unité non prise en charge: " + request.getFromUnit());
        }
    }

    private Double convertFromMeters(Double value, String toUnit) {
        switch (toUnit) {
            case "kilometers":
                return value / 1000;
            case "miles":
                return value / 1609.34;
            case "feet":
                return value * 3.281;
            // ... autres conversions
            default:
                throw new IllegalArgumentException("Conversion non prise en charge vers: " + toUnit);
        }
    }

    private Double convertFromGrams(Double value, String toUnit) {
        switch (toUnit) {
            case "kilograms":
                return value / 1000;
            case "pounds":
                return value / 453.592;
            // ... autres conversions
            default:
                throw new IllegalArgumentException("Conversion non prise en charge vers: " + toUnit);
        }
    }

    private Double convertFromLiters(Double value, String toUnit) {
        switch (toUnit) {
            case "milliliters":
                return value * 1000;
            case "us_gallons":
                return value / 3.785;
            // ... autres conversions
            default:
                throw new IllegalArgumentException("Conversion non prise en charge vers: " + toUnit);
        }
    }

    private Double convertFromCelsius(Double value, String toUnit) {
        switch (toUnit) {
            case "fahrenheit":
                return (value * 9/5) + 32;
            case "kelvin":
                return value + 273.15;
            // ... autres conversions
            default:
                throw new IllegalArgumentException("Conversion non prise en charge vers: " + toUnit);
        }
    }

    private Double convertFromKmPerHour(Double value, String toUnit) {
        switch (toUnit) {
            case "m/s":
                return value / 3.6;
            case "mph":
                return value / 1.609;
            case "speed_of_light":
                return value / 1.079e+9; // C'est une approximation.
            // ... autres conversions
            default:
                throw new IllegalArgumentException("Conversion non prise en charge vers: " + toUnit);
        }
    }

    // Vous devriez ajouter d'autres méthodes pour d'autres types d'unités ici...
}
