package com.actionpattern.strategypattern;

public class CashReturn extends CashSuper {

    int preMoney;

    int returnMoney;

    public CashReturn(int i, int i1) {
        preMoney = i;
        returnMoney = i1;
    }

    @Override
    public float returnResult(float money) {
       int  returnTime = 0;
       float originalMoney = money;
       while(money > preMoney){
           money = money - preMoney;
           returnTime ++;
       }
       return originalMoney - (returnTime * 100);

    }
}
