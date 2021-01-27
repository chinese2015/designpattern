package com.actionpattern.statepattern.example;

public class NightState implements State {


    @Override
    public void handle(WritingProgram writingProgram) {
        if(writingProgram.getClock() < 24){
            System.out.println("还是当天晚上");
        }else
        System.out.println("又他妈过了一天");
        writingProgram.setState(new ForenoonState());
        writingProgram.setClock(0);
    }
}
