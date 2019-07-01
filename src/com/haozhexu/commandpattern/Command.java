package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public interface Command {
    void execute();
    void undo();
}
