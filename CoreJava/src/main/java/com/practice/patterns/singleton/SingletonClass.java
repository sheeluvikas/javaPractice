package com.practice.patterns.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass;

    public SingletonClass getInstance() {
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }
}
