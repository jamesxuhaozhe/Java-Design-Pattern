package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public interface Subject {
    void removeObservor(Observor o);
    void registerObservor(Observor o);
    void notifiyObservors();
}
