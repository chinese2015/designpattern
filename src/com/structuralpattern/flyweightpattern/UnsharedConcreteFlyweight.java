package com.structuralpattern.flyweightpattern;

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    void operation(int extrinsicState) {
        System.out.println("ClassName: "+this.getClass().getSimpleName()+"--Statecode:"+ extrinsicState);

    }


}
