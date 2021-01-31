package com.actionpattern.chainofresponsbilitypattern;

public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest(Request request);
}
