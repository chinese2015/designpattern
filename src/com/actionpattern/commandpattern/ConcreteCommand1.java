package com.actionpattern.commandpattern;

public class ConcreteCommand1 extends Command {
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        System.out.println("通过ConcreteCommand1执行");
        receiver.action1();
    }
}
