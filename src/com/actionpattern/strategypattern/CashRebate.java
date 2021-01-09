package com.actionpattern.strategypattern;

public class CashRebate extends CashSuper {
    private float rebate = 1.0f;

    public CashRebate(float v) {

        rebate = v;
    }


    @Override
    public float returnResult(float money) {
        return money * rebate;
    }
}
