package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public abstract class Pizza {
    String name;
    public void prepare() {
        System.out.println("Preparing " + name);
    }
    public void cook() {
        System.out.println("Cooking " + name);
    }
    public void cut() {
        System.out.println("Cutting " + name);
    }
    public String toString() {
        return "The pizza is " + name;
    }
}
