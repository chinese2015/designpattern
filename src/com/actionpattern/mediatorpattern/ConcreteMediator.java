package com.actionpattern.mediatorpattern;

public class ConcreteMediator extends Mediator {

    private Colleague concreteConlleague1;

    private Colleague concreteConlleague2;

    public void setConcreteConlleague1(Colleague concreteConlleague1) {
        this.concreteConlleague1 = concreteConlleague1;
    }

    public void setConcreteConlleague2(Colleague concreteConlleague2) {
        this.concreteConlleague2 = concreteConlleague2;
    }

    public void sendMessage(Colleague colleague, String message) {
        if(colleague!=concreteConlleague1){
            concreteConlleague2.notify(message);
        }else{
            concreteConlleague1.notify(message);
        }
    }
}
