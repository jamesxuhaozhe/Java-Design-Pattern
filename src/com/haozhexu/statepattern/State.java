package com.haozhexu.statepattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public interface State {
    public void insertCoin();
    public void ejectCoin();
    public void pullCrank();
    public void dispense();
    public void refill(int count);
}
