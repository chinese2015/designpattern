package com.actionpattern.strategypattern;

public class Client {

    public static void main(String[] args) {
        CashContext cc  = new CashContext("满300返100");
        float actualMoney = cc.getResult(800f);

        System.out.println(actualMoney);

        cc = new CashContext("打9折");
        actualMoney = cc.getResult(400);

        System.out.println(actualMoney);

        cc = new CashContext("不打折");
        actualMoney = cc.getResult(400);

        System.out.println(actualMoney);
    }
}
