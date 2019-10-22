package com.haozhexu.strategy_pattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public abstract class Duck {

    Flyable flyable;
    Quackable quackable;

    public Duck() {
    }

    public void setFlyable(Flyable fb) {
        flyable = fb;
    }

    public void setQuackable(Quackable qb) {
        quackable = qb;
    }

    public abstract void display();

    public void fly() {
        flyable.fly();
    }

    public void quack() {
        quackable.quack();
    }

}
