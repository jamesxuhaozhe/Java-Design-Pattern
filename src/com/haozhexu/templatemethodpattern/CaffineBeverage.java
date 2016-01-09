package com.haozhexu.templatemethodpattern;

/**
 * Created by haozhexu on 1/9/16.
 */
public abstract class CaffineBeverage {
    final public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (needToAddCondiments()) {
            addCondiments();
        }
    }

    boolean needToAddCondiments() {
        return true;
    }

    void boilWater() {
        System.out.println("Boling water.");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring beverage in cup.");
    }

    abstract void addCondiments();
}
