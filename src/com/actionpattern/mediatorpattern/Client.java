package com.actionpattern.mediatorpattern;

public class Client {

    public static void main(String[] args) {

        Colleague c1 = new ConcreteColleague1();

        Colleague c2 = new ConcreteColleague2();

        Mediator mediator = new ConcreteMediator();

        c1.setMediator(mediator);

        c2.setMediator(mediator);

        mediator.setConcreteConlleague1(c1);

        mediator.setConcreteConlleague2(c2);

        c1.sendMessage("c1hahahaha");

        c2.sendMessage("c2hahahaha");

    }
}
