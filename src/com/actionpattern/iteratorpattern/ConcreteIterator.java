package com.actionpattern.iteratorpattern;

public class ConcreteIterator  implements Iterator{

    int cursor;

    Object[] objects;

    @Override
    public boolean hasNext() {
        return cursor < objects.length ;
    }

    @Override
    public Object next() {
        int i = cursor;

        cursor ++;
       return objects[i];

    }
}
