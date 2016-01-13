package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class Quackologist implements MyObserver {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + "just quacked.");
    }
}
