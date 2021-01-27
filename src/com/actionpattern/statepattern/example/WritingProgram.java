package com.actionpattern.statepattern.example;

public class WritingProgram {

    private int clock;

    private State state;

    public WritingProgram(State state){
        this.state = state;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getDetailState(){
        this.state.handle(this);
    }

}
