package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
        System.out.println("Execute LightOn command.");
    }

    @Override
    public void undo() {
        this.light.off();
    }

    public String toString() {
        return "Light On Command";
    }
}
