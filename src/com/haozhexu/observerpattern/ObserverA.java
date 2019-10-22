package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class ObserverA implements Observer, Displayable {
    private int previousTemp;
    private int currentTemp;
    private int futureTemp;
    private Subject weatherData;

    public ObserverA(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Previous temp is: " + previousTemp +
                          " CurrentTemp is: " + currentTemp +
                           " FutureTemp is: " + futureTemp);
    }

    @Override
    public void update(int prev, int curr, int futr) {
        this.previousTemp = prev;
        this.currentTemp = curr;
        this.futureTemp = futr;
        display();
    }
}
