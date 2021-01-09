package com.structuralpattern.decoratorpattern;

public class Trouser extends Finery{
    public Trouser(Person p) {
        super(p);
    }

    public void Show(){
        System.out.print("穿了一条裤子");
        super.Show();
    }
}
