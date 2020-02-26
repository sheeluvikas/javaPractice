package com.practice.streams;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    /**
     * This method returns the Integer list of the given size and each Integer will be from 0 to maxBound
     *
     * @param maxBound
     * @param size
     * @return
     */
    public static List<Integer> getRandomIntegerList(int maxBound, int size) {

        List<Integer> list = new ArrayList<>(size);
        for(int i = 0; i < size; i ++){
            Random random = new Random();
            int value = random.nextInt(maxBound);
            list.add(value);
        }
        return list;
    }
}
