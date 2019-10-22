package com.haozhexu.decorator_pattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
