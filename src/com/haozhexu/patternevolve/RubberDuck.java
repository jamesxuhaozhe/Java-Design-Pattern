package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class RubberDuck implements Quackable {
    private MyObservable observable;
    public RubberDuck() {
        observable = new MyObservable(this);
    }
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
