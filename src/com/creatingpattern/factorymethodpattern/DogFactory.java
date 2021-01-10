package com.creatingpattern.factorymethodpattern;

public class DogFactory implements IFactory {
    @Override
    public IOriginal create() {
        return new Dog();
    }
}
