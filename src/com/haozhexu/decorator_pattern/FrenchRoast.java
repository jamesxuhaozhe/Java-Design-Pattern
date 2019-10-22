package com.haozhexu.decorator_pattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class FrenchRoast extends Beverage {

    public FrenchRoast() {
        description = "French Roast";
    }

    @Override
    public double cost() {
        return 2.11;
    }
}
