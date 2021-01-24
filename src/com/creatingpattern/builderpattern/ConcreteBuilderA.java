package com.creatingpattern.builderpattern;

public class ConcreteBuilderA implements Builder {

    private Product product = new Product();

    @Override
    public void BuildA() {
        product.setParts("装配部件甲");
    }

    @Override
    public void BuildB() {
        product.setParts("装配部件乙");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
