package com.actionpattern.strategypattern;

public class CashContext {

    private CashSuper cs;

    public CashContext(String str){
        switch (str){
            case "不打折":
                cs = new CashNormal();
                break;
            case "打9折":
                cs = new CashRebate(0.9f);
                break;
            case "满300返100":
                cs = new CashReturn(300,100);
                break;
            default:
                cs = new CashNormal();
        }

    }
    public float getResult(float money){
        return cs.returnResult(money);
    }

}
