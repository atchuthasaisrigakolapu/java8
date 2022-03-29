package com.learnjava.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatingLocalTimeExample {
    public static void parseTime(){

        String time = "13:00";
        LocalTime parse = LocalTime.parse(time);
        System.out.println("parse"+parse);
        LocalTime parse2 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("parse2" + parse2);
        //custom defined format
        String time2 = "13*00";
        LocalTime parse3 = LocalTime.parse(time2,DateTimeFormatter.ofPattern("HH*mm"));
        System.out.println("parse3" + parse3);
        String time3 = "13*00*23";
        LocalTime parse4 = LocalTime.parse(time3,DateTimeFormatter.ofPattern("HH*mm*ss"));
        System.out.println("parse4" + parse4);
    }
    public static void formtTime(){
        LocalTime now = LocalTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("hh:mm"));
        System.out.println("format:"+format);
    }

    public static void main(String[] args) {
        parseTime();
        formtTime();
    }
}
