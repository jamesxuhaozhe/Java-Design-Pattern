package com.haozhexu.patternevolve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/13/16.
 */
public class Flock implements Quackable {
    private List<Quackable> quackables;

    public Flock() {
        quackables = new ArrayList<>();
    }

    public void addQuackable(Quackable quackable) {
        quackables.add(quackable);
    }

    public Flock addQuackableAndReturnSelf(Quackable quackable) {
        quackables.add(quackable);
        return this;
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(MyObserver observer) {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
