package com.creatingpattern.factorymethodpattern;

public class HumanFactory implements IFactory{
    @Override
    public IOriginal create() {
        return new Human();
    }
}
