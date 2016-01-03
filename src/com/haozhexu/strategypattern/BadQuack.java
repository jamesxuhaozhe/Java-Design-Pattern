package com.haozhexu.strategypattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public class BadQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack is kind bad!");
    }
}
