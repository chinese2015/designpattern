package com.actionpattern.observerpattern;


public abstract class Observer {
     Subject sub;

     String name;

    public Observer(Subject sub,String name){
        this.sub = sub;

        this.name = name;

    }


    abstract void update();
}
