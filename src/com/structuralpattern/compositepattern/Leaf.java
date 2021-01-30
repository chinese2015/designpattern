package com.structuralpattern.compositepattern;

import javax.xml.namespace.QName;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("叶子节点不支持该方法");
    }

    @Override
    public void remove(Component c) {
        System.out.println("叶子节点不支持该方法");
    }

    @Override
    public void display(int depth) {
        String depthPrefix = "";
        for(int i = 0;i<depth;i++) {
            depthPrefix+="-";
        }
        System.out.println(depthPrefix+ getName());

    }
}
