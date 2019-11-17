package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TempDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        TempDemo tempDemo = TempDemo.class.getConstructor().newInstance();
        tempDemo.method();
        TempDemo tempDemo1 = TempDemo.class.newInstance();
    }

    public static void method(){
        System.out.println("This is the method() of the TempDemo class");
    }
}
