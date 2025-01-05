package com.challengeAlura.modelos;

import java.util.Map;

public record Conversor(String base_code, Map<String, Double> conversion_rates) {

    public double getConversionRate(String currency) {
        return conversion_rates.getOrDefault(currency, 0.0);
    }

    @Override
    public String toString() {
        return "Valor: " + getConversionRate("USD"); // Por defecto, muestra la tasa de USD
    }
}


