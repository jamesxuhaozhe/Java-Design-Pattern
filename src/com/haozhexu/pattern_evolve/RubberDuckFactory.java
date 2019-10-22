package com.haozhexu.pattern_evolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class RubberDuckFactory implements QuackableFactory {
    @Override
    public Quackable createQuackable() {
        return new RubberDuck();
    }
}
