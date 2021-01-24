package com.creatingpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<String>();

    public void setParts(String part){
        parts.add(part);
    }

    public void ShowParts(){
            System.out.println("该产品的部件为:");
            System.out.println(parts);
    }


}
