package com.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> componentList = new ArrayList<Component>();


    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {

        componentList.add(c);

    }

    @Override
    public void remove(Component c) {

        componentList.remove(c);

    }

    @Override
    public void display(int depth) {

        String depthPrefix = "";
        for(int i = 0;i<depth;i++) {
            depthPrefix+="-";
        }
        System.out.println(depthPrefix+ getName());

        for(Component c: componentList){
            c.display(depth + 2 );
        }

    }
}
