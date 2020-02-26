package com.practice.streams;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Utils {

    private static String capitalAlphas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lowerAlphas = "abcdefghijklmnopqrstuvwxyz";
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

    /**
     * This method returns the list of String type of the given size.
     * Each element of this string list will have a minimum of 4 characters
     * and maximum of 8 characters.
     *
     * @param size
     * @return
     */
    public static List<String> getStringList(int size){
        List<String> list = new ArrayList<>();

        IntStream.range(0, size).forEach(x -> {
            Random random = new Random();
            int stringSize = random.nextInt(5) + 4;
            list.add(getRandomString(stringSize));
        });
        return list;
    }

    /**
     * This method returns the random string of the given size.
     *
     * @param stringSize
     * @return
     */
    private static String getRandomString(int stringSize){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, stringSize).forEach(y -> {
            if(y ==0) {
                stringBuilder.append(capitalAlphas.charAt(random.nextInt(26)));
            }
            else {
                stringBuilder.append(lowerAlphas.charAt(random.nextInt(26)));
            }
        });
        return stringBuilder.toString();
    }
}
