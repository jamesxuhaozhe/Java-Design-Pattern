package com.haozhexu.statepattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public class StatePatternDemo {
    public static void main(final String[] args) {
        GumballMachine machine = new GumballMachine(5);
        machine.insertCoin();
        machine.pullCrank();
        System.out.println(machine.getBallCount());
    }
}
