package com.structuralpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<String,Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweightMs(String key) {
        Flyweight flyweight = flyweights.get(key);

        if(flyweight == null){
            flyweight = new ConcreteFlyweight();
            flyweights.put(key,flyweight);

        }
        return flyweight;

    }
}
