package com.haozhexu.commandpattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class RemoteControl {
    private static final int DEFAULT_SLOTS = 10;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[DEFAULT_SLOTS];
        offCommands = new Command[DEFAULT_SLOTS];
        Command noCommand = new NoCommand();
        for (int i = 0; i < DEFAULT_SLOTS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) throws ArrayIndexOutOfBoundsException {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undo() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("On Commands are: ");
        for (Command command : onCommands) {
            sb.append(command.toString() + " ");
        }
        System.out.println();
        sb.append("Off commands are: ");
        for (Command command : offCommands) {
            sb.append(command.toString() + " ");
        }
        return sb.toString();
    }
}
