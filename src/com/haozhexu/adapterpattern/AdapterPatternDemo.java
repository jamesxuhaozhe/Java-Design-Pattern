package com.haozhexu.adapterpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class AdapterPatternDemo {

    public static void main(final String[] args) {
        Duck duck = new RealDuck();
        Turkey turkey = new RealTurkey();
        Duck adaptedTurkey = new TurkeyAdapter(turkey);
        DuckActivityTestDriver duckActivityTestDriver = new DuckActivityTestDriver();
        duckActivityTestDriver.addDuck(duck);
        duckActivityTestDriver.addDuck(adaptedTurkey);
        duckActivityTestDriver.testQuack();
    }
}
