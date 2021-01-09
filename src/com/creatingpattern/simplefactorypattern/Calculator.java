package com.creatingpattern.simplefactorypattern;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        OperationFactory factory = new OperationFactory();


        System.out.println("Please type in first num");

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        System.out.println("Please type in second num");
        String b = sc.next();

        System.out.println("Please type in Operaton");

        String opS = sc.next();

        Operation op = factory.getOperation(opS);

        float result = op.getResult(Float.parseFloat(a), Float.parseFloat(b));

        System.out.println("The result is " + result);


    }
}
