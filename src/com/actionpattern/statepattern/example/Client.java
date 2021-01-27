package com.actionpattern.statepattern.example;

public class Client {

    public static void main(String[] args) {
        WritingProgram writingProgram = new WritingProgram(new ForenoonState());
        writingProgram.setClock(19);

        writingProgram.getDetailState();

        writingProgram.setClock(13);

        writingProgram.getDetailState();


        writingProgram.setClock(15);


        writingProgram.getDetailState();
        writingProgram.setClock(19);

        writingProgram.getDetailState();

        writingProgram.setClock(24);
        writingProgram.getDetailState();
    }
}
