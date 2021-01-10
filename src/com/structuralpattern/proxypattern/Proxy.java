package com.structuralpattern.proxypattern;

public class Proxy extends Subject {


    Subject realSubject;

    public Proxy(Subject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("Using proxy");
        realSubject.request();
        System.out.println("Proxy finished");
    }
}
