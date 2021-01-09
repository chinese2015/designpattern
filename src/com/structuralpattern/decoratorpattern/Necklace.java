package com.structuralpattern.decoratorpattern;

public class Necklace extends Finery{
    public Necklace(Person p) {
        super(p);
    }

    public void Show(){
        System.out.print("戴了一条项链");
        super.Show();
    }
}
