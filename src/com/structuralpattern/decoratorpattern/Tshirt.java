package com.structuralpattern.decoratorpattern;

public class Tshirt extends Finery{
    public Tshirt(Person p) {
        super(p);
    }

    public void Show(){
        System.out.print("穿了一件T恤");
        super.Show();
    }
}
