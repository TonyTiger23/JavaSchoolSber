package org.example;

public class TemperatureConverterService {
    private final TemperatureConverter converter;
    public TemperatureConverterService(TemperatureConverter temperatureConverter) {
        this.converter = temperatureConverter;
    }

    public double convert(double celsiusTemperature) {
        return converter.convert(celsiusTemperature);
    }
}
