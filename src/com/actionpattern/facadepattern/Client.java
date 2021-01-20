package com.actionpattern.facadepattern;

public class Client {

    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.methodA();

        facade.methodB();

        //try commit from shileon
    }
}
