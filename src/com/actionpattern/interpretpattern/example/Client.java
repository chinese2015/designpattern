package com.actionpattern.interpretpattern.example;

public class Client {

    public static void main(String[] args) {
         PlayContext context = new PlayContext();

         context.setContext("O 2 D 1 A 0.5 O 1 D 1 E 0.25 G 0.5 O 3 A 1 ");

         AbstractExpression expression = null;

         while(context.getContext().length()>0){

          String key = context.getContext().substring(0,1);

          switch (key){
              case "O":
                  expression = new ScaleExpression();
                  break;

              case "C":
              case "D":
              case "E":
              case "F":
              case "G":
              case "A":
              case "B":
              case "P":
                  expression = new NoteExpression();
          }
          expression.interpret(context);


         }
    }
}
