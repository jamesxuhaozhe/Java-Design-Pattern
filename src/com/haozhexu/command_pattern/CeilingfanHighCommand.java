package com.haozhexu.command_pattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class CeilingfanHighCommand implements Command {

    private Ceilingfan ceilingfan;
    private int lastSpeed;

    public CeilingfanHighCommand(Ceilingfan ceilingfan) {
        this.ceilingfan = ceilingfan;
    }
    @Override
    public void execute() {
        lastSpeed = ceilingfan.getSpeed();
        ceilingfan.high();
        System.out.println("Execute CeilingfanHigh Command.");
    }

    @Override
    public void undo() {
        if (lastSpeed == Ceilingfan.OFF) {
            ceilingfan.off();
        } else if (lastSpeed == Ceilingfan.LOW) {
            ceilingfan.low();
        } else if (lastSpeed == Ceilingfan.HIGH) {
            ceilingfan.high();
        } else if (lastSpeed == Ceilingfan.MEDIUM) {
            ceilingfan.medium();
        }
    }

    public String toString() {
        return "Ceilingfan High Command";
    }
}
