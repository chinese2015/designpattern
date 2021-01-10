package com.structuralpattern.proxypattern;

public class Client {

    public static void main(String[] args) {

        Subject realSubject = new RealSubject();

        Subject proxy = new Proxy(realSubject);

        proxy.request();

    }
}
