package com.learnjava.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

    public static void main(String[] args) {
        //java.util.Date to LOcalDate and vice versa
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.of("America/New_York")).toLocalDate();
        System.out.println("localDate"+localDate);
      // Date date2  =  new Date().f
        //java.sql Date to LOcalDate and vice versa
        java.sql.Date date1 = java.sql.Date.valueOf(localDate);
        System.out.println("date2:"+date1);
        LocalDate localDate1 = date1.toLocalDate();
        System.out.println("Java.sql.Date to localDate1"+localDate1);

    }
}
