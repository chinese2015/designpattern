package com.actionpattern.observerpattern;

public class Client {


    public static void main(String[] args) {

        Subject concreteSubject = new ConcreteSubject();



        Observer ob1 = new ConcreteObserver(concreteSubject,"ob1");

        Observer ob2 = new ConcreteObserver(concreteSubject, "ob2");

        concreteSubject.attach(ob1);

        concreteSubject.attach(ob2);

        concreteSubject.setAction("状态1");

        concreteSubject.notifyObservers();


        System.out.println("ob2被移除出观察者队列");

        concreteSubject.detach(ob2);

        concreteSubject.setAction("状态2");

        concreteSubject.notifyObservers();




    }






}
