package com.actionpattern.mediatorpattern;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this,message);
    }

    public void notify(String message){
        System.out.println("ConcreteColleague1 get message: "+ message);
    }
}
