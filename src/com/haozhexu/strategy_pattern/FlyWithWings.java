package com.haozhexu.strategy_pattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("I fly with wings!");
    }
}
