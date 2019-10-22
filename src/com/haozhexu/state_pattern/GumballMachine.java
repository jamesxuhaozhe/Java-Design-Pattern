package com.haozhexu.state_pattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public class GumballMachine implements State {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;
    private int ballCount;
    private State currState;

    public GumballMachine(int count) {
        ballCount = count;
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        currState = ballCount > 0 ? noCoinState : soldOutState;
    }

    @Override
    public void insertCoin() {
        currState.insertCoin();
    }

    @Override
    public void ejectCoin() {
        currState.ejectCoin();
    }

    @Override
    public void pullCrank() {
        currState.pullCrank();
        currState.dispense();
    }

    @Override
    public void dispense() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void refill(int count) {
        currState.refill(count);
    }

    public void setState(State state) {
        currState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setBallCount(int count) {
        ballCount += count;
    }

    public void giveGumball() {
        System.out.println("A gumball rolling out the slot..");
        if (ballCount != 0) {
            ballCount = ballCount - 1;
        }
    }

    public int getBallCount() {
        return ballCount;
    }
}
