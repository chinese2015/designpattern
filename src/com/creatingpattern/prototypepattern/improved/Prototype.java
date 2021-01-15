package com.creatingpattern.prototypepattern.improved;

public class Prototype implements Cloneable {

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

    private Prototype (Car car) throws CloneNotSupportedException {
        this.car = car.clone();
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

    public Prototype prototypeClone() throws CloneNotSupportedException {


        Prototype obj = new Prototype(this.car);

        obj.setId(this.getId());

        obj.setName(this.getName());

        return obj;
    }


    public String toDetail(){
        return "id="+id+"---"+"name="+name+"---car="+car.getBrand()+","+car.getSpeed();
    }


}
