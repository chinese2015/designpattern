package com.actionpattern.templatemethodpattern;

public class Client {
    public static void main(String[] args) {

        TemplateClass concrete1 = new ConcreteClass1();

        TemplateClass concrete2 = new ConcreteClass2();

        concrete1.templateMethod();

        concrete2.templateMethod();

    }

}
