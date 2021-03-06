package com.creatingpattern.prototypepattern;

public abstract class Prototype implements Cloneable {

    private String id;

    private String name;

    private Car car;



    public Prototype(){

        car = new Car();

    }


    public Prototype(String id,String name){

        this.id = id;
        this.name = name;

        this.car = new Car();
    }

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
        this.car.setBrand(brand);
        this.car.setSpeed(speed);
    }

    public abstract Prototype  prototypeClone() throws CloneNotSupportedException;


    public String toDetail(){
        return "id="+id+"---"+"name="+name+"---car="+car.getBrand()+","+car.getSpeed();
    }


}
