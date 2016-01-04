package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class ObservorB implements Observor, Displayable {
    private int previousTemp;
    private int currentTemp;
    private int futureTemp;
    private Subject weatherData;

    public ObservorB(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObservor(this);
    }
    @Override
    public void display() {
        System.out.println("CurrentT is: " + currentTemp +
                " PreviousT is: " + previousTemp +
                " FutureT is: " + futureTemp);
    }

    @Override
    public void update(int prev, int curr, int futr) {
        this.previousTemp = prev;
        this.currentTemp = curr;
        this.futureTemp = futr;
        display();
    }
}