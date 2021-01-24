package com.creatingpattern.builderpattern;

public class Client {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilderA();

        //Builder builder = new ConcreteBuilderB();

        Director director = new Director(builder);

        Product product = director.CreateProduct();

        product.ShowParts();
    }
}
