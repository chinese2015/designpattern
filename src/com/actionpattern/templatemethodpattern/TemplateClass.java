package com.actionpattern.templatemethodpattern;

public abstract class TemplateClass {

    public abstract void primitiveOperation1();

    public abstract void primiteOoperation2();

    public void templateMethod(){

        System.out.println("考试题目:1+1等于几");

        primitiveOperation1();

        System.out.println("考试题目:2+2等于几");

        primiteOoperation2();

    }
}
