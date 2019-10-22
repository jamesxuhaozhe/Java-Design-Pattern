package com.haozhexu.command_pattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class CommandPatternDemo {

    public static void main(final String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        Ceilingfan ceilingfan = new Ceilingfan();
        Command ceilingfanHighCommand = new CeilingfanHighCommand(ceilingfan);
        Command ceilingfanOffCommand = new CeilingfanOffCommand(ceilingfan);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, ceilingfanHighCommand, ceilingfanOffCommand);

        remoteControl.onButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl);

    }

}
