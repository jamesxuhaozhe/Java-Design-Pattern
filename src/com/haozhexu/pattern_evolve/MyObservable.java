package com.haozhexu.pattern_evolve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/13/16.
 */
public class MyObservable implements QuackObservable {
    private List<MyObserver> observers;
    private QuackObservable duck;

    public MyObservable(QuackObservable duck) {
        this.duck = duck;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<MyObserver> iterator = observers.iterator();
        while (iterator.hasNext()) {
            MyObserver observer = iterator.next();
            observer.update(duck);
        }
    }
}
