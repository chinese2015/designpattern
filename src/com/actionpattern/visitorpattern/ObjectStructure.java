package com.actionpattern.visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    List<Element> elementList = new ArrayList<Element>();

    public void attach(Element element){
        elementList.add(element);
    }

    public void detach(Element element){
        elementList.remove(element);
    }

    public void accept(Visitor visitor){
        for(Element e :elementList){
            e.visit(visitor);
        }
    }
}
