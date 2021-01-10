package com.creatingpattern.factorymethodpattern;

public class Dog implements IOriginal {
    @Override
    public void run() {
        System.out.println("Dog running");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleeping");

    }

    @Override
    public void eat() {

        System.out.println("Dog eating");

    }
}
