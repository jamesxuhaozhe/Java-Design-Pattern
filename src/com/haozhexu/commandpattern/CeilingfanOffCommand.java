package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class CeilingfanOffCommand implements Command {
    private Ceilingfan ceilingfan;
    private int lastSpeed;

    public CeilingfanOffCommand(Ceilingfan ceilingfan) {
        this.ceilingfan = ceilingfan;
    }

    @Override
    public void execute() {
        lastSpeed = ceilingfan.getSpeed();
        ceilingfan.off();
        System.out.println("Execute CeilingfanOff command.");
    }

    @Override
    public void undo() {
        if (lastSpeed == Ceilingfan.HIGH) {
            ceilingfan.high();
        } else if (lastSpeed == Ceilingfan.MEDIUM) {
            ceilingfan.medium();
        } else if (lastSpeed == Ceilingfan.LOW) {
            ceilingfan.low();
        } else if (lastSpeed == Ceilingfan.OFF) {
            ceilingfan.off();
        }
    }

    public String toString() {
        return "Ceilingfan Off Command";
    }
}
