package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class ObserverPatternDemo {
    public static void main(final String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(1, 2, 3);
        ObserverA observorA = new ObserverA(weatherData);
        ObserverB observorB = new ObserverB(weatherData);
        weatherData.setMeasurements(5, 6, 7);
        weatherData.setMeasurements(2, 3, 4);
    }
}
