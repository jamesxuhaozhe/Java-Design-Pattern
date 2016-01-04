package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public interface Subject {
    public void removeObservor(Observor o);
    public void registerObservor(Observor o);
    public void notifiyObservors();
}
