package com.learnjava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now : "+now);
        LocalDateTime of = LocalDateTime.of(2022, 03, 29, 02, 12);
        System.out.println("of : "+of);
        LocalDateTime of1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("of1:"+of1);
        System.out.println("getHour:"+now.getHour());
        System.out.println("getMinute:"+now.getMinute());
        System.out.println("getDayOfMonth:"+now.getDayOfMonth());
        System.out.println("ChronoField.DAY_OF_MONTH:"+now.get(ChronoField.DAY_OF_MONTH));
        System.out.println("plusMonths"+now.plusMonths(2));
        System.out.println("minusMonths"+now.minusMonths(2));
        System.out.println("now.withMonth"+now.withMonth(12));

        //converting localDate and localTime to localDateTime and viceversa
        LocalDate of2 = LocalDate.of(2022, 03, 29);
        System.out.println("atTime:"+of2.atTime(03,12));
        LocalTime of3 = LocalTime.of(03, 12);
        System.out.println("atDate:"+of3.atDate(of2));
        LocalDateTime localDateTime = of3.atDate(of2);
        System.out.println("toLocalDate:"+localDateTime.toLocalDate());
        System.out.println("toLocalTime:"+localDateTime.toLocalTime());
    }
}
