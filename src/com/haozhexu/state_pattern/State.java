package com.haozhexu.state_pattern;

/**
 * Created by haozhexu on 1/11/16.
 */
public interface State {
    void insertCoin();
    void ejectCoin();
    void pullCrank();
    void dispense();
    void refill(int count);
}
