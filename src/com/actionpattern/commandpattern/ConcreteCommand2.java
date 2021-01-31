package com.actionpattern.commandpattern;

public class ConcreteCommand2 extends Command {
    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        System.out.println("通过ConcreteCommand2执行");
        receiver.action2();
    }
}
