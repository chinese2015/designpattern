package com.actionpattern.statepattern.example;

public class ForenoonState implements State {
    @Override
    public void handle(WritingProgram writingProgram) {
        if(writingProgram.getClock() <=12){
            System.out.println("还是上午");
        }
        else if(writingProgram.getClock() >12){
            System.out.println("下午了");
            writingProgram.setState(new AfternoonState());
            writingProgram.getDetailState();
        }
    }
}
