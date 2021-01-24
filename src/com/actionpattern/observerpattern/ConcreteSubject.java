package com.actionpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public  class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList();

    private String action;


    public void attach(Observer ob){

        observers.add(ob);
    }

    public void detach(Observer ob){
        observers.remove(ob);

    }

    public void notifyObservers(){

        for(Observer ob:observers){
            ob.update();
        }

    }


    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
