package com.haozhexu.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/4/16.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private int previousTemp;
    private int currentTemp;
    private int futureTemp;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(previousTemp, currentTemp, futureTemp);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int prev, int curr, int futr) {
        this.previousTemp = prev;
        this.currentTemp = curr;
        this.futureTemp = futr;
        measurementsChanged();
    }

    public int getPreviousTemp() {
        return this.previousTemp;
    }

    public int getCurrentTemp() {
        return this.currentTemp;
    }

    public int getFutureTemp() {
        return this.futureTemp;
    }
}
