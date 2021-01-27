package com.actionpattern.statepattern.example;

public class AfternoonState implements State {
    @Override
    public void handle(WritingProgram writingProgram) {
       if(writingProgram.getClock() <= 18){
           System.out.println("还是下午");
       }
        else if(writingProgram.getClock() > 18){
            System.out.println("晚上了");
            writingProgram.setState(new NightState());
            writingProgram.getDetailState();
        }
    }
}
