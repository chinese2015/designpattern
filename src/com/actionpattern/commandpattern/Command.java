package com.actionpattern.commandpattern;

public abstract class Command {

    protected Receiver receiver;

    public Command (Receiver receiver){
        this.receiver = receiver;
    }

    abstract void execute();
}
