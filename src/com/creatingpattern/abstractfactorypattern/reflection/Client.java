package com.creatingpattern.abstractfactorypattern.reflection;

import java.lang.reflect.InvocationTargetException;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String productAClassName = "com.creatingpattern.abstractfactorypattern.reflection.ConcreteProductA2";

        String productBClassName = "com.creatingpattern.abstractfactorypattern.reflection.ConcreteProductB2";

        DataAccess dataAccess = new DataAccess();


        dataAccess.setProductAClassName(productAClassName);

        dataAccess.setProductBClassName(productBClassName);

        ProductA productA = dataAccess.getProductA();

        ProductB productB = dataAccess.getProductB();

        productA.showDetailProductA();

        productB.showDetailProductB();
    }
}
