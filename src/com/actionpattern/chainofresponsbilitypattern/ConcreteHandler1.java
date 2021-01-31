package com.actionpattern.chainofresponsbilitypattern;

public class ConcreteHandler1 extends Handler {


    @Override
    public void handleRequest(Request request) {
        if(request.requestInt <=10 && request.requestInt >0 ){
            System.out.println("ConcreteHandler1 handled" + request.requestInt);
        }else if(request.requestInt >10&& successor!=null){
            System.out.println("Next Handler handles");
            successor.handleRequest(request);
        }
                 }
}
