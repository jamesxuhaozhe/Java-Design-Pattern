package com.haozhexu.strategy_pattern;

/**
 * Created by haozhexu on 1/3/16.
 */
public class StrategeyPatternDemo {

    public static void main(final String[] args) {
        Duck duck = new ConcreteDuck();
        duck.setFlyable(new FlyWithWings());
        duck.setQuackable(new BadQuack());
        duck.display();
        duck.fly();
        duck.quack();
    }
}
