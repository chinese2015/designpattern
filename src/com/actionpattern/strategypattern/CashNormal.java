package com.actionpattern.strategypattern;

public class CashNormal  extends CashSuper{


    @Override
    public float returnResult(float money) {
        return money;
    }
}
