package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    private MyObservable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new MyObservable(this);
    }
    @Override
    public void quack() {
        goose.honk();
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
