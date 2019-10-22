package com.haozhexu.pattern_evolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class DuckCallFactory implements QuackableFactory {
    @Override
    public Quackable createQuackable() {
        return new  DuckCall();
    }
}
