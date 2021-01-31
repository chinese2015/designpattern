package com.actionpattern.mediatorpattern;

public abstract class Mediator {

     abstract void setConcreteConlleague1(Colleague concreteConlleague1);

     abstract void setConcreteConlleague2(Colleague concreteConlleague1);

    public abstract void sendMessage(Colleague colleague,String message);

}
