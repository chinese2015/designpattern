package com.structuralpattern.adapterpattern;

public class Adapter extends Target {


    Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }


    @Override
    public void method1() {
        System.out.println("Adapter used");
        adaptee.specialMethod();
    }
}
