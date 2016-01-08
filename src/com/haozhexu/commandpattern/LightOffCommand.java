package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
        System.out.println("Execute LightOff Command.");
    }

    @Override
    public void undo() {
        this.light.on();
    }

    public String toString() {
        return "Light off Command";
    }
}
