package com.structuralpattern.adapterpattern;

public class Client {

    public static void main(String[] args) {
       Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        Target concreteTargetA = new ConcreteTargetA();
        concreteTargetA.method1();
        adapter.method1();

    }
}
