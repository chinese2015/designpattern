package com.creatingpattern.singletonpattern.hungry;

public class HungrySingeletonWith2Syc {


    private static HungrySingeletonWith2Syc instance;

    private HungrySingeletonWith2Syc(){

    };

    public static HungrySingeletonWith2Syc getInstance(){
        if(instance == null){
            synchronized (HungrySingeletonWith2Syc.class){
                if(instance==null){
                    instance = new HungrySingeletonWith2Syc();
                }
            }

        }

        return instance;


    }


}
