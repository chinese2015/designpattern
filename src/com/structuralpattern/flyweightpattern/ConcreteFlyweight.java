package com.structuralpattern.flyweightpattern;

public class ConcreteFlyweight extends Flyweight {
    @Override
    void operation(int extrinsicState) {
        System.out.println("ClassName: "+this.getClass().getSimpleName()+"--Statecode:"+ extrinsicState);

    }


}
