package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to ...
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 13-01-2019
 */
public class ConcurrentHashMapDemo {

    public static void main(String args[]){
        List<String> list = new ArrayList<>();

        list.add("Vikas");
        int i = 0;
        for(String s : list){
            list.add("R"+i);
            i ++;
        }
    }
}
