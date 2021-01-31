package com.creatingpattern.singletonpattern.hungry;

public class HungrySingeletonWith1Syc {


    private static HungrySingeletonWith1Syc instance;

    private HungrySingeletonWith1Syc(){

    };

    public static HungrySingeletonWith1Syc getInstance(){
        if(instance == null){
            synchronized (HungrySingeletonWith1Syc.class){

                    instance = new HungrySingeletonWith1Syc();

            }

        }

        return instance;


    }


}
