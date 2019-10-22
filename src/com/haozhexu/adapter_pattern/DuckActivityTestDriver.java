package com.haozhexu.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/8/16.
 */
public class DuckActivityTestDriver {
    private List<Duck> ducks;

    public DuckActivityTestDriver() {
        ducks = new ArrayList<>();
    }

    public void addDuck(Duck duck) {
        ducks.add(duck);
    }

    public void testQuack() {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }
}
