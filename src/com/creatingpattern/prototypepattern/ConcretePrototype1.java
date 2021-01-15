package com.creatingpattern.prototypepattern;

public class ConcretePrototype1 extends Prototype {


    public ConcretePrototype1(){
    }


    public ConcretePrototype1(String id, String name) {
        super(id, name);
    }

    @Override
    public Prototype prototypeClone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }

}
