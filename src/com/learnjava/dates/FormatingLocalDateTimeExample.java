package com.learnjava.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatingLocalDateTimeExample {
    public static void parseLocalDateTime(){
        String dateTime = "2022-03-29T08:41:33";
        LocalDateTime parse = LocalDateTime.parse(dateTime);
        System.out.println("parse:"+parse);
        LocalDateTime parse2 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("parse2:"+parse2);
        String dateTime2 = "2022*03*29T08:41:33";
        LocalDateTime parse3 = LocalDateTime.parse(dateTime2, DateTimeFormatter.ofPattern("yyyy*MM*dd'T'HH:mm:ss"));
        System.out.println("parse3:"+parse3);
        String dateTime3 = "2022*03*29abc08|41|33";
        LocalDateTime parse4 = LocalDateTime.parse(dateTime3, DateTimeFormatter.ofPattern("yyyy*MM*dd'abc'HH|mm|ss"));
        System.out.println("parse4:"+parse4);
    }
    public static void formatLocalDateTime(){
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH:mm:ss"));
        System.out.println("format:"+format);

    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
