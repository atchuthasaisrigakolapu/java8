package com.learnjava.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimePeriodExample {

    public static void main(String[] args) {
        LocalTime of = LocalTime.of(8, 20);
        LocalTime of1 = LocalTime.of(9, 20);
        long until = of.until(of1, ChronoUnit.MINUTES);
        System.out.println("Diff:"+until);
        Duration between = Duration.between(of, of1);
        System.out.println("toMinutes:"+between.toMinutes());
        Duration of2 = Duration.ofHours(3);
        System.out.println("toMinutes:"+of2.toMinutes());

     //   LocalDate now = LocalDate.now();
//        LocalDate localDate = LocalDate.now().plusDays(10);
//        Duration between1 = Duration.between(now, localDate);
//        System.out.println("between1"+between1);
    }
}
