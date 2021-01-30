package com.structuralpattern.compositepattern;

public class Client {


    public static void main(String[] args) {

        Component root = new Composite("root");

        Component leftComposite = new Composite("leftCOmposite");

        Component middleComposite = new Composite("middleCOmposite");

        Component rightComposite = new Composite("rightCOmposite");

        root.add(leftComposite);

        root.add(middleComposite);

        root.add(rightComposite);

        leftComposite.add(new Leaf("llLeaf"));

        leftComposite.add(new Leaf("lmLeaf"));

        leftComposite.add(new Leaf("lrLeaf"));

        middleComposite.add(new Leaf("mlLeaf"));

        middleComposite.add(new Leaf("mmLeaf"));

        middleComposite.add(new Leaf("mrLeaf"));

        rightComposite.add(new Leaf("lrleaf"));

        root.display(0);





    }
}
