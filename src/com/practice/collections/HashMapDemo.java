package com.practice.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to ...
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 06-01-2019
 */
public class HashMapDemo {

    public static void main(String args[]){

        Map<Student, String> hashMap = new HashMap<>();
        System.out.println("Created the empty HashMap");

        hashMap.put(new Student(1, "Vikas"), "Vikas");
        hashMap.put(new Student(1, "Vikas"), "Rahul");



    }


}
