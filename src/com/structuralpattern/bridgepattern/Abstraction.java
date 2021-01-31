package com.structuralpattern.bridgepattern;

public abstract class Abstraction {

    abstract void operation();

    abstract void setImplementor(Implementor implementor);
}
