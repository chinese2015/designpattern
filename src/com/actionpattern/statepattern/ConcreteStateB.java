package com.actionpattern.statepattern;

public class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        context.getState().showStateDetail();
        context.setState(new ConcreteStateA());
    }

    @Override
    public void showStateDetail() {
        System.out.println("现在是状态B");
    }
}
