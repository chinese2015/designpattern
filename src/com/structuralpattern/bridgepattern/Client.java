package com.structuralpattern.bridgepattern;

public class Client {

    public static void main(String[] args) {
        Abstraction ra1 = new RefinedAbstraction1();

        Abstraction ra2 = new RefinedAbstraction2();



        ra1.setImplementor(new ConcreteImplementorA());

        ra2.setImplementor(new ConcreteImplementorB());

        ra1.operation();

        ra2.operation();


    }
}
