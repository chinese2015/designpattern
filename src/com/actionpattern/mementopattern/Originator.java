package com.actionpattern.mementopattern;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memmento){
        this.state = memmento.getState();
    }

    public Memento getMemento(){
        return new Memento(state);
    }

    public void show(){
        System.out.println("The state is "+state);
    }
}
