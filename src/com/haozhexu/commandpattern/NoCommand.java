package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    public String toString() {
        return "No command";
    }
}
