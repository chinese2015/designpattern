package com.actionpattern.observerpattern;

public class ConcreteObserver extends Observer {


    public ConcreteObserver(Subject sub, String name) {
        super(sub, name);
    }

    @Override
    public void update() {
        System.out.println("新状态:"+sub.getAction()+"---"+name+"收到了通知");
    }
}
