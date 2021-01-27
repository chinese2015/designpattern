package com.actionpattern.statepattern;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        context.getState().showStateDetail();
        context.setState(new ConcreteStateB());
    }

    @Override
    public void showStateDetail() {
        System.out.println("现在是状态A");
    }
}
