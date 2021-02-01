package com.actionpattern.visitorpattern;

public class ConcreteElementB extends Element {
    @Override
    void visit(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
