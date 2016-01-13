package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getQuackCount() {
        return numberOfQuacks;
    }
}
