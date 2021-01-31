package com.structuralpattern.bridgepattern;

public class RefinedAbstraction2 extends Abstraction {

    private Implementor implementor;


    @Override
    void operation() {
        System.out.println("This is RefiedAbstraction2");
        implementor.operation();
    }

    @Override
    void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
