package com.haozhexu.strategypattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
