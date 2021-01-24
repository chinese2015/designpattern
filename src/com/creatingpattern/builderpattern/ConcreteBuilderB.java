package com.creatingpattern.builderpattern;

public class ConcreteBuilderB implements Builder {

    private Product product = new Product();

    @Override
    public void BuildA() {
        product.setParts("装配部件A");
    }

    @Override
    public void BuildB() {
        product.setParts("装配部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
