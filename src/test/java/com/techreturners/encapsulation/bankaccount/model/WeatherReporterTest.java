package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {

    @Test
    void printLondonTest31c() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 31);
        String expected = "I am in London and it is 🌦. It's too hot 🥵!. The temperature in Fahrenheit is 87.8.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printLondonTest29c() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 29);
        String expected = "I am in London and it is \uD83C\uDF26. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 84.2.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printLondonTest9c() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 9);
        String expected = "I am in London and it is \uD83C\uDF26. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 48.2.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printMoscowTest1c() {
        WeatherReporter weatherReporter = new WeatherReporter("Moscow", 1);
        String expected = "I am in Moscow and it is \uD83D\uDD06. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 33.8.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printCaliforniaTest35c() {
        WeatherReporter weatherReporter = new WeatherReporter("California", 35);
        String expected = "I am in California and it is \uD83C\uDF05. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 95.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printCaliforniaTest3c() {
        WeatherReporter weatherReporter = new WeatherReporter("California", 3);
        String expected = "I am in California and it is \uD83C\uDF05. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 37.4.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printCaliforniaTest15c() {
        WeatherReporter weatherReporter = new WeatherReporter("California", 15);
        String expected = "I am in California and it is \uD83C\uDF05. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 59.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printCapeTownTest35c() {
        WeatherReporter weatherReporter = new WeatherReporter("Cape Town", 35);
        String expected = "I am in Cape Town and it is \uD83C\uDF24. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 95.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printCapeTownTest3c() {
        WeatherReporter weatherReporter = new WeatherReporter("Cape Town", 3);
        String expected = "I am in Cape Town and it is \uD83C\uDF24. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 37.4.";

        assertEquals(expected, weatherReporter.print());
    }

    @Test
    void printCapeTownTest15c() {
        WeatherReporter weatherReporter = new WeatherReporter("Cape Town", 15);
        String expected = "I am in Cape Town and it is \uD83C\uDF24. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 59.";

        assertEquals(expected, weatherReporter.print());
    }
}