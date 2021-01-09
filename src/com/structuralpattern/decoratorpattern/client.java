package com.structuralpattern.decoratorpattern;

public class client {

    public static void main(String[] args) {


        //创建一个人
        Person zhangsan = new Person("Zhangsan");

        //先给张三穿裤子
        Trouser trouser = new Trouser(zhangsan);

        //再给张三戴项链

        Necklace necklace = new Necklace(trouser);

        //再给张三穿T恤

        Tshirt tshirt = new Tshirt(necklace);

        //最后展示

        tshirt.Show();
    }
}
