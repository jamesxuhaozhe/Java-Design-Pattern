package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public abstract class Pizza {
    String name;
    Source source;
    Dough dough;
    public abstract void prepare();
    public void cook() {
        System.out.println("Cooking " + name);
    }
    public void cut() {
        System.out.println("Cutting " + name);
    }
    public String toString() {
        return "The pizza is " + name + "with ingredients: " + source.getSourceName() + " " + dough.getDoughName();
    }
}
