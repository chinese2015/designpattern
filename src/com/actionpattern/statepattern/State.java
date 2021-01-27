package com.actionpattern.statepattern;

public interface State {

    void handle(Context context);

    void showStateDetail();
}
