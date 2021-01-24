package com.actionpattern.observerpattern;

public interface Subject {


    void attach(Observer ob);

    void detach(Observer ob);

    void notifyObservers();

    String getAction();

    void setAction(String concretesubject);
}
