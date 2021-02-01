package com.actionpattern.visitorpattern;

public class ConcreteVisitorA  extends Visitor{
    @Override
    void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+" visited by" +
                this.getClass().getSimpleName());


    }

    @Override
    void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+" visited by" +
                this.getClass().getSimpleName());


    }
}
