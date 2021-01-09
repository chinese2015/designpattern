package com.structuralpattern.decoratorpattern;

public abstract class Finery  extends Person{


    Person person;


    public Finery(Person p) {
        super();
        person = p;
    }

    public void Show(){
        if(person!=null)
            person.Show();
    }
}
