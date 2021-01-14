package com.creatingpattern.prototypepattern;

public class ConcretePrototype1 extends Prototype {
    @Override
    public Prototype prototypeClone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }

}
