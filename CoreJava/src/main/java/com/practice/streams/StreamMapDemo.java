package com.practice.streams;

import sun.tools.tree.DoubleExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/***
 * this class explains the concept of map method of stream in java 8
 *
 */
public class StreamMapDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(14);

        /** stream().map(Function<T, R> mapper) */
        List<String> monthList = list.stream().map(StreamMapDemo::getMonth).collect(Collectors.toList());
        /** here above, we used method references : square, it works because it takes one argument and returns another
         * this is similare to Function, explained above.
         * */

        monthList.stream().forEach(System.out::println);



        List<Double> salary = Arrays.asList(10000D, 20000D, 15000D);

        BinaryOperator<Double> binaryOperator = (a, b) -> (a.doubleValue() + b.doubleValue())/2;

        Optional<Double> totalK = salary.stream().map(x -> x/1000).reduce(binaryOperator);
        System.out.println(totalK.get());

        /******** Find the greatest ****/
        List<Integer> intList = Arrays.asList(1, 5, 6, 3, 2, 4, 6, 7, 8, 12, 32, 4, 5, 32, 4, 22, 4);

        BinaryOperator<Integer> getGratest = (a, b) -> a > b ? a : b;

        System.out.println("The greates number is : " + intList.stream().reduce(getGratest).get());
    }

    private static Double getAverage(Double a, Double b){
        System.out.println("a = " + a + ", b = " + b);
        return (a.doubleValue() + b.doubleValue())/2;
    }

    /**
     * Its similar to apply method of Function, as it takes one argument and returns another
     *
     * @param i
     * @return
     */
    public static String getMonth(Integer i){
        return getMonthName(i);
    }

    public static String getMonthName(Integer monthNumber){
        switch (monthNumber){
            case 1 : return "January";
            case 2 : return "February";
            case 3 : return "March";
            case 4 : return "April";
            case 5 : return "May";
            case 6 : return "June";
            case 7 : return "July";
            case 8 : return "August";
            case 9 : return "September";
            case 10 : return "October";
            case 11 : return "November";
            case 12 : return "December";
            default: return monthNumber + " is Not a valid month number";

        }
    }

}
