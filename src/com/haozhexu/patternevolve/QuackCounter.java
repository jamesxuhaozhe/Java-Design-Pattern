package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int numberOfQuacks = 1;
    private MyObservable observable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        observable = new MyObservable(this);
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getQuackCount() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(MyObserver observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
