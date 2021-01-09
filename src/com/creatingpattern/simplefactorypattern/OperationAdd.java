package com.creatingpattern.simplefactorypattern;

public class OperationAdd extends Operation {


    @Override
    public float getResult(float a, float b) {
        return a + b;
    }
}
