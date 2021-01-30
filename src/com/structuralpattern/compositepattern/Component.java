package com.structuralpattern.compositepattern;

public abstract class Component {

    private String name;


    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract  void remove(Component c);

    public abstract  void display(int depth);


    public String getName() {
        return name;
    }
}
