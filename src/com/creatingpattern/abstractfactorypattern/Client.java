package com.creatingpattern.abstractfactorypattern;

public class Client {

    public static void main(String[] args) {
        //AbstractFactory factory = new ConcreteFactory1();
        AbstractFactory factory = new ConcreteFactory2();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        productA.showDetailProductA();

        productB.showDetailProductB();

    }
}
