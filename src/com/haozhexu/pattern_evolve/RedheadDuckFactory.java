package com.haozhexu.pattern_evolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class RedheadDuckFactory implements QuackableFactory {
    @Override
    public Quackable createQuackable() {
        return new RedheadDuck();
    }
}
