package com.haozhexu.adapterpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class RealDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("I am a duck and I am quacking..");
    }

    @Override
    public void fly() {
        System.out.println("I am a duck and I am flying..");
    }
}
