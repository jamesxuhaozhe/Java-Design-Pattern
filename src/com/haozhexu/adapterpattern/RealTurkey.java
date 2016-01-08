package com.haozhexu.adapterpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class RealTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("I am turky and I am gobbling..");
    }

    @Override
    public void fly() {
        System.out.println("I am a turkey and I can only fly for a short distance..");
    }
}
