package com.haozhexu.templatemethodpattern;

/**
 * Created by haozhexu on 1/9/16.
 */
public class Tea extends CaffineBeverage {
    @Override
    void brew() {
        System.out.println("Brew the tea leaves.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemons to tea.");
    }
}
