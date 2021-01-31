package com.actionpattern.mediatorpattern;

public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void notify(String message);
}
