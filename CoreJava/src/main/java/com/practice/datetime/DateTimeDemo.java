package com.practice.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * This class explains the usage of Date Time API
 *
 */
public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.MAX);
        System.out.println(date.plusDays(2));
        System.out.println(date.minus(1, ChronoUnit.MONTHS));
        DayOfWeek weekDay = date.getDayOfWeek();
        System.out.println(weekDay.get(ChronoField.DAY_OF_WEEK));
    }
}
