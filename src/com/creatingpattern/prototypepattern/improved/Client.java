package com.creatingpattern.prototypepattern.improved;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype prototype1 = new Prototype();

        prototype1.setId("1");

        prototype1.setName("zhangsan");

        prototype1.setCar("BMW","130");

        Prototype clonePrototype = prototype1.prototypeClone();

        System.out.println( prototype1.toDetail());


        System.out.println(clonePrototype.toDetail());


        clonePrototype.setId("2");

        clonePrototype.setName("lisi");

        clonePrototype.setCar("BENZ","120");

        System.out.println( prototype1.toDetail());


        System.out.println(clonePrototype.toDetail());

        System.out.println(prototype1);

        System.out.println(clonePrototype);


    }
}
