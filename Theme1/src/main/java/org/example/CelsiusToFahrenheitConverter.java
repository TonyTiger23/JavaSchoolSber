package org.example;

public class CelsiusToFahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperatue)
    {
        return celsiusTemperatue * 9/5 + 32;
    }
}
