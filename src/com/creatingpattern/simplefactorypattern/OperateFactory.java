package com.creatingpattern.simplefactorypattern;

class OperationFactory {

    public Operation getOperation(String s){





        Operation oper = null;

        switch (s) {


           case "+":
               oper = new OperationAdd();
               break;
           case "-":
               oper = new OperationSub();
               break;
           case "*":
               oper = new OperationMul();
               break;
           case "/":
               oper = new OperationDiv();
               break;
        }


        return oper;

    }



}
