package com.structuralpattern.flyweightpattern;

public class Client {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        int extrinsicstate = 22;
        Flyweight fx = factory.getFlyweightMs("X");
        Flyweight fy = factory.getFlyweightMs("Y");
        Flyweight fz = factory.getFlyweightMs("Z");
        Flyweight uf = new UnsharedConcreteFlyweight();
        fx.operation(--extrinsicstate);
        fy.operation(--extrinsicstate);
        fz.operation(--extrinsicstate);
        uf.operation(--extrinsicstate);


    }
}
