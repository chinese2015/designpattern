package com.actionpattern.mediatorpattern;

public class ConcreteColleague2 extends Colleague {
    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this,message);
    }

    public void notify(String message){
        System.out.println("ConcreteColleague2 get message: "+ message);
    }
}
