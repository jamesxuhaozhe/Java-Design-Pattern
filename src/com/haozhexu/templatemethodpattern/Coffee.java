package com.haozhexu.templatemethodpattern;

/**
 * Created by haozhexu on 1/9/16.
 */
public class Coffee extends CaffineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing the coffee beans.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk and sugar to the coffee.");
    }
}
