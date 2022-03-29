package com.learnjava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now : "+now);
        LocalTime of = LocalTime.of(04, 55);
        System.out.println("of : "+of);
        LocalTime of1 = LocalTime.of(04, 55, 58);
        System.out.println("of1 : "+of1);
        LocalTime of2 = LocalTime.of(04, 55, 58, 88798);
        System.out.println("of2 : "+of2);
        System.out.println("now.getHour():"+now.getHour());
        System.out.println("now.getMinute():"+now.getMinute());
        System.out.println("now.getSecond():"+now.getSecond());
        System.out.println("now.getHour():"+now.getHour());
        System.out.println("ChronoField.CLOCK_HOUR_OF_DAY"+now.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("now.minusHours"+now.minusHours(2));
        System.out.println("now.minus"+now.minus(2, ChronoUnit.HOURS));
    }
}


