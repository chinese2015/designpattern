package com.creatingpattern.abstractfactorypattern.reflection;

import java.lang.reflect.InvocationTargetException;

public class DataAccess {

    private String productAClassName;

    private String productBClassName;

    public void setProductAClassName(String productAClassName) {
        this.productAClassName = productAClassName;
    }

    public void setProductBClassName(String productBClassName) {
        this.productBClassName = productBClassName;
    }


    public ProductA getProductA() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {


            return (ProductA) Class.forName(productAClassName).getDeclaredConstructor().newInstance();


    }

    public ProductB getProductB() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {


        return  (ProductB) Class.forName(productBClassName).getDeclaredConstructor().newInstance();


    }





}
