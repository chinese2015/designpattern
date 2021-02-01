package com.actionpattern.visitorpattern;

public class ConcreteElementA extends Element {
    @Override
    void visit(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
