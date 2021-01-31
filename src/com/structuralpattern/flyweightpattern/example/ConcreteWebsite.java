package com.structuralpattern.flyweightpattern.example;

public class ConcreteWebsite  extends Website{
    @Override
    void use(User user) {

        System.out.println("网站名称:" + getWebSiteName() + "  用户为:" +user.username);

    }
}
