package com.actionpattern.visitorpattern;

public abstract class Visitor {

    abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
