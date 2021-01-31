package com.actionpattern.chainofresponsbilitypattern;

public class Client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();

        Handler h2 = new ConcreteHandler2();

        Handler h3 = new ConcreteHandler3();

        h1.successor = h2;

        h2.successor = h3;

        for(int i = 1; i < 30;i+=5){
            Request request = new Request();
            request.requestInt = i;
            h1.handleRequest(request);
        }




    }
}
