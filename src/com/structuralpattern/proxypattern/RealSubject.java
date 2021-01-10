package com.structuralpattern.proxypattern;

import javax.swing.*;

public class RealSubject extends Subject {


    @Override
    public void request() {
        System.out.println("真实对象方法执行");
    }
}
