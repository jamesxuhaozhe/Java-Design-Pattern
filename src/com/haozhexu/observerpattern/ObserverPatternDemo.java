package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class ObserverPatternDemo {
    public static void main(final String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(1, 2, 3);
        ObservorA observorA = new ObservorA(weatherData);
        ObservorB observorB = new ObservorB(weatherData);
        weatherData.setMeasurements(5, 6, 7);
        weatherData.setMeasurements(2, 3, 4);
    }
}
