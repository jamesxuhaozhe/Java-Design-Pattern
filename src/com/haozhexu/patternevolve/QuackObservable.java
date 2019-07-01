package com.haozhexu.patternevolve;


/**
 * Created by haozhexu on 1/13/16.
 */
public interface QuackObservable {
    void registerObserver(MyObserver observer);
    void notifyObservers();
}
