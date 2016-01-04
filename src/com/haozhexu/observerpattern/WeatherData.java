package com.haozhexu.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/4/16.
 */
public class WeatherData implements Subject {
    private List<Observor> observors;
    private int previousTemp;
    private int currentTemp;
    private int futureTemp;

    public WeatherData() {
        observors = new ArrayList<>();
    }
    @Override
    public void removeObservor(Observor o) {
        int index = observors.indexOf(o);
        observors.remove(index);
    }

    @Override
    public void registerObservor(Observor o) {
        observors.add(o);
    }

    @Override
    public void notifiyObservors() {
        for (Observor o : observors) {
            o.update(previousTemp, currentTemp, futureTemp);
        }
    }

    public void measurementsChanged() {
        notifiyObservors();
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
