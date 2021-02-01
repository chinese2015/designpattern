package com.actionpattern.visitorpattern;

public class Client {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();

        Element ea  = new ConcreteElementA();

        Element eb = new ConcreteElementB();

        Visitor va = new ConcreteVisitorA();

        Visitor vb = new ConcreteVisitorB();

        os.attach(ea);

        os.attach(eb);

        os.accept(va);

        os.accept(vb);
    }
}
