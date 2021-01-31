package com.actionpattern.chainofresponsbilitypattern;

public class ConcreteHandler3 extends Handler {


    @Override
    public void handleRequest(Request request) {
        if(request.requestInt <=30 && request.requestInt >20 ){
            System.out.println("ConcreteHandler3 handled" + request.requestInt);
        }else if(request.requestInt >30 && successor!=null){
            System.out.println("Next Handler handles");
            successor.handleRequest(request);
        }
                 }
}
