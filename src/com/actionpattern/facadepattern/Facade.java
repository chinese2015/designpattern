package com.actionpattern.facadepattern;

public class Facade {
    SubSystem1 system1;

    SubSystem2 system2;

    SubSystem3 system3;

    public Facade(){
        system1 = new SubSystem1();

        system2 = new SubSystem2();

        system3 = new SubSystem3();

    }

    public void methodA(){
        System.out.println("This is MethodA");

        system1.method1();

        system3.method3();
    }

    public void methodB(){

        System.out.println("This is methodB");

        system2.method2();

        system3.method3();

    }
}
