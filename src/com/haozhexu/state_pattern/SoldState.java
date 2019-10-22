package com.haozhexu.state_pattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine machine) {
        gumballMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Arealdy inserted a coin. No need to insert a second one.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("You cannot eject coin right now.");
    }

    @Override
    public void pullCrank() {
        System.out.println("You have already pulled the crank.");
    }

    @Override
    public void dispense() {
        gumballMachine.giveGumball();
        if (gumballMachine.getBallCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Now a bad time to refill.");
    }
}
