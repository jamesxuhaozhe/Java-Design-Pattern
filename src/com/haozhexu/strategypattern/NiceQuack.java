package com.haozhexu.strategypattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public class NiceQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("My quack is kinda nice!");
    }
}
