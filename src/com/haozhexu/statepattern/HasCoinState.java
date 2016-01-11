package com.haozhexu.statepattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public class HasCoinState implements State {

    private GumballMachine gumballMachine;

    public HasCoinState(GumballMachine machine) {
        gumballMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You have already insert a coin.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Eject the coin.");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void pullCrank() {
        System.out.println("Pulling the crank.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("You have to pull the crank first.");
    }

    @Override
    public void refill(int count) {
        System.out.println("Working and not a good time for refilling.");
    }
}
