package com.haozhexu.statepattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public class NoCoinState implements State {

    private GumballMachine gumballMachine;

    public NoCoinState(GumballMachine machine) {
        gumballMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Insert one coin into the gumballmachine.");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("The machine does not have any coin at all. It cannot eject any coins.");
    }

    @Override
    public void pullCrank() {
        System.out.println("You need to insert the coin to pull the crank.");
    }

    @Override
    public void dispense() {
        System.out.println("To dispense anything, you need to pay first.");
    }

    @Override
    public void refill(int count) {
        gumballMachine.setBallCount(count);
    }
}
