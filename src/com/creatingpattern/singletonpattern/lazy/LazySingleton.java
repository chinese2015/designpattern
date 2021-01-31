package com.creatingpattern.singletonpattern.lazy;

public class LazySingleton {


    private static LazySingleton instance = new LazySingleton();

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        return instance;
    }




}
