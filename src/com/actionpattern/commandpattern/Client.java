package com.actionpattern.commandpattern;

public class Client {

    public static void main(String[] args) {


        Receiver receiver = new Receiver();

        Command command1 = new ConcreteCommand1(receiver);

        Command command2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker();

        invoker.addCommand(command1);

        invoker.addCommand(command2);

        invoker.notifyCommands();

        invoker.removeCommand(command2);

        invoker.notifyCommands();
    }



}
