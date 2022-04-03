package com.learnjava.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        //Jan 1st 1970->EPOCH ->86400 seconds
        System.out.println("getEpcoSeconds"+instant.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(0));
        Instant instant2 = Instant.now();
        Duration between = Duration.between(instant, instant2);
        System.out.println("between:"+between.getNano());

    }
}
