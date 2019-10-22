package com.haozhexu.pattern_evolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class RedheadDuck implements Quackable {
    private MyObservable observable;

    public RedheadDuck() {
        observable = new MyObservable(this);
    }
    @Override
    public void quack() {
        System.out.println("Quack");
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
