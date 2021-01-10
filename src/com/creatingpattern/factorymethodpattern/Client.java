package com.creatingpattern.factorymethodpattern;

public class Client {

    public static void main(String[] args) {
        //IFactory factory = new DogFactory();
        IFactory factory = new HumanFactory();

        IOriginal iOriginal = factory.create();

        iOriginal.eat();
        iOriginal.run();
        iOriginal.sleep();
    }
}
