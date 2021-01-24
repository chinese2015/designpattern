package com.creatingpattern.builderpattern;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;

    }

    public Product CreateProduct(){
        builder.BuildA();
        builder.BuildB();
        return builder.getResult();
    }



}
