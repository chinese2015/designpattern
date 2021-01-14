package com.creatingpattern.prototypepattern;

public abstract class Prototype implements Cloneable {

    private String id;

    private String name;

    private Car car;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(String brand,String speed) {
        this.car = new Car(brand,speed);
    }

    public abstract Prototype  prototypeClone() throws CloneNotSupportedException;


    public String toDetail(){
        return "id="+id+"---"+"name="+name+"---car="+car.getBrand()+","+car.getSpeed();
    }


}
