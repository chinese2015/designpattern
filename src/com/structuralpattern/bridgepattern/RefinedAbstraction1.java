package com.structuralpattern.bridgepattern;

public class RefinedAbstraction1 extends Abstraction {

    private Implementor implementor;


    @Override
    void operation() {
        System.out.println("This is RefiedAbstraction1");
        implementor.operation();
    }

    @Override
    void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
