package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public interface Subject {
    void removeObserver(Observer o);
    void registerObserver(Observer o);
    void notifyObservers();
}
