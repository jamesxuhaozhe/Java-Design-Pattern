package com.haozhexu.state_pattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine machine) {
        gumballMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("There is no use inserting coin right now.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Machine is out of balls, no use ejecting.");
    }

    @Override
    public void pullCrank() {
        System.out.println("Machine is out of balls, no use even pulling the crank.");
    }

    @Override
    public void dispense() {
        System.out.println("Machine is out of balls, no use dispensing.");
    }

    @Override
    public void refill(int count) {
        gumballMachine.setBallCount(count);
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
}
