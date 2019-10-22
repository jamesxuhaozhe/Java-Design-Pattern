package com.haozhexu.observerpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public interface Observer {
    void update(int prev, int curr, int futr);
}
