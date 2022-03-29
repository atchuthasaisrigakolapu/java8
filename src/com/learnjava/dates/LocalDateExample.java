package com.learnjava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("localdate : " + now);
        LocalDate of = LocalDate.of(1993, 9, 12);
        System.out.println("of : " + of);
        LocalDate localDate = LocalDate.ofYearDay(1993, 255);
        System.out.println("ofYearDay" + localDate);
        //Get from localDate
        System.out.println("getMonth:" + of.getMonth());//SEPTEMBER
        System.out.println("getDayOfMonth:" + of.getDayOfMonth());//12
        System.out.println("getDayOfWeek:" + of.getDayOfWeek());//SUNDAY
        System.out.println("getDayOfYear:" + of.getDayOfYear());//255
        System.out.println("ChronoField:" + of.get(ChronoField.DAY_OF_MONTH));//12

        //modify local date
        System.out.println("plusDays" + now.plusDays(7));
        System.out.println("plusWeeks" + now.plusWeeks(1));
        System.out.println("plusWeeks" + now.plusMonths(1));
        System.out.println("plusYears" + now.plusYears(1));

        System.out.println("choronounit minus months" + now.minus(1, ChronoUnit.MONTHS));
        System.out.println("choronounit minus year" + now.minus(1, ChronoUnit.YEARS));

        System.out.println("ofYearDay : " + LocalDate.ofYearDay(2022, 1));
        System.out.println("equals : " + localDate.equals(LocalDate.now()));
        System.out.println("before : " + of.isBefore(now));
        System.out.println("after : " + now.isAfter(of));
        //Unsupported media

        //System.out.println("Chronounit minus : "+localDate.minus(1,ChronoUnit.MINUTES));
        System.out.println("Is supported minutes:: " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("Is supported months:: " + localDate.isSupported(ChronoUnit.MONTHS));

    }
}
