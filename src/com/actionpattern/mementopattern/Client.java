package com.actionpattern.mementopattern;

public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();

        o.setState("On");

        o.show();

        Caretaker caretaker = new Caretaker(o.getMemento());

        o.setState("Off");

        o.show();

        o.setMemento(caretaker.getMemento());

        o.show();

    }
}
