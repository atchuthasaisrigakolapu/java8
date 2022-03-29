package com.learnjava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    public static void parseLocalDate(){
    //String to LocalDate
        String date = "2022-03-29";
        LocalDate parse = LocalDate.parse(date);
        System.out.println("String to LocalDate:"+parse);
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("String to LocalDate1:"+localDate);
        String date2 = "20220329";
        LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("String to LocalDate1:"+localDate2);
    //Custom defined data format
        String date3 = "2022|12|31";
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate parse1 = LocalDate.parse(date3, dateTimeFormatter);
        System.out.println("String to parse1:"+parse1);
        String date4 = "2022|12|31";
        DateTimeFormatter dateTimeFormatter2 =  DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate parse2 = LocalDate.parse(date4, dateTimeFormatter2);
        System.out.println("String to parse2:"+parse2);
    }
    public static void formatLocalDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate =  LocalDate.now();
        String format = localDate.format(dateTimeFormatter);
        System.out.println("format"+format);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();

    }
}
