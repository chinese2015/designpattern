package com.actionpattern.chainofresponsbilitypattern;

public class ConcreteHandler2 extends Handler {


    @Override
    public void handleRequest(Request request) {
        if(request.requestInt <=20 && request.requestInt >10 ){
            System.out.println("ConcreteHandler2 handled" + request.requestInt);
        }else if(request.requestInt >20&& successor!=null){
            System.out.println("Next Handler handles");
            successor.handleRequest(request);
        }
                 }
}
