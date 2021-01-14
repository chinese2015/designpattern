package com.creatingpattern.prototypepattern;

public class Car implements Cloneable {

    private String brand;

    private String speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Car(String brand, String speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
