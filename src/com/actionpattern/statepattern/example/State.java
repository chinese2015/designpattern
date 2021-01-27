package com.actionpattern.statepattern.example;

import com.actionpattern.statepattern.Context;

public interface State {

    void handle(WritingProgram writingProgram);

    //void showStateDetail();
}
