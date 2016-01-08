package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class Ceilingfan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    private int speed;

    public Ceilingfan() {
        this.speed = OFF;
    }

    public void low() {
        this.speed = LOW;
    }

    public void medium() {
        this.speed = MEDIUM;
    }

    public void high() {
        this.speed = HIGH;
    }

    public void off() {
        this.speed = OFF;
    }

    public int getSpeed() {
        return this.speed;
    }
}
