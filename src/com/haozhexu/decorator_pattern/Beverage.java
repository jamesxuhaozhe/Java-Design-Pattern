package com.haozhexu.decorator_pattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
