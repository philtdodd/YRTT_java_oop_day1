package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    public String location;
    public double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    private static final double C_TO_F_MULTIPLIER = 1.8;
    private static final double C_TO_F_ADDITION = 32.0;

    private double newTemp(double temperature) {
        return(C_TO_F_MULTIPLIER * temperature + C_TO_F_ADDITION);
    }

    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location,
                checkLocationWeatherSymbol(),
                checkTemperature(),
                newTemp(temperature));
    }

    private String checkLocationWeatherSymbol() {
        return switch (location) {
            case "London" -> "🌦";
            case "California" -> "🌅";
            case "Cape Town" -> "🌤";
            default -> "🔆";
        };
    }

    private static final double tooHot = 30;
    private static final double tooCold = 10;

    private String checkTemperature() {
        if (temperature > tooHot) {
            return "It's too hot 🥵!";
        } else if (temperature < tooCold) {
            return "It's too cold 🥶!";
        }

        return "Ahhh...it's just right 😊!";
    }

}
