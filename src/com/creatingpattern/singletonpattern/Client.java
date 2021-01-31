package com.creatingpattern.singletonpattern;

import com.creatingpattern.singletonpattern.hungry.HungrySingeletonWith0Syc;
import com.creatingpattern.singletonpattern.hungry.HungrySingeletonWith1Syc;
import com.creatingpattern.singletonpattern.hungry.HungrySingeletonWith2Syc;
import com.creatingpattern.singletonpattern.lazy.LazySingleton;
import com.structuralpattern.adapterpattern.Target;

public class Client {


    public static void main(String[] args) {
        for(int i =0;i < 500;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    HungrySingeletonWith0Syc s1 = HungrySingeletonWith0Syc.getInstance();

//                    HungrySingeletonWith1Syc s1 = HungrySingeletonWith1Syc.getInstance();

//                    HungrySingeletonWith2Syc s1 = HungrySingeletonWith2Syc.getInstance();
                    //LazySingleton s1 = LazySingleton.getInstance();
                    System.out.println(s1);
                }
            });
            t.start();
        }
    }




}
