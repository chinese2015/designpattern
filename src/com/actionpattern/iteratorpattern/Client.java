package com.actionpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List list = new ArrayList<Object>();

        Iterator iterator = list.iterator();

        iterator.hasNext();

        //List list = new ArrayList();


    }
}
