package com.haozhexu.strategypattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public class StrategeyPatternDemo {

    public static void main(final String[] args) {
        Duck duck = new ConreteDuck();
        duck.setFlyable(new FlyWithWings());
        duck.setQuackable(new BadQuack());
        duck.display();
        duck.fly();
        duck.quack();
    }
}