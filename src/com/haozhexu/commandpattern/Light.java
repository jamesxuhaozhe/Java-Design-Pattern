package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }
}
