package com.haozhexu.patternevolve;


/**
 * Created by haozhexu on 1/13/16.
 */
public interface QuackObservable {
    public void registerObserver(MyObserver observer);
    public void notifyObservers();
}
