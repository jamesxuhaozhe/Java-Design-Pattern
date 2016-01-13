package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
