package com.creatingpattern.factorymethodpattern;

public class Human implements IOriginal {
    @Override
    public void run() {
        System.out.println("人在跑");
    }

    @Override
    public void sleep() {
        System.out.println("人在睡");

    }

    @Override
    public void eat() {
        System.out.println("人在吃");

    }
}
