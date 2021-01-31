package com.creatingpattern.singletonpattern.hungry;

public class HungrySingeletonWith0Syc {


    private static HungrySingeletonWith0Syc instance;

    private HungrySingeletonWith0Syc(){

    };

    public static HungrySingeletonWith0Syc getInstance(){

                if(instance==null){
                    instance = new HungrySingeletonWith0Syc();
                }


        return instance;


    }


}
