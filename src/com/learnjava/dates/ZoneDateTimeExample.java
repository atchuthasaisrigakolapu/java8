package com.learnjava.dates;

import java.time.*;
import java.util.Set;

public class ZoneDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime::"+zonedDateTime);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println("zoneOffset::"+zoneOffset);
        ZoneId zoneId = zonedDateTime.getZone();
        System.out.println("zoneId::"+zoneId);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.stream().forEach(System.out::println);
        System.out.println("No of available zones::"+availableZoneIds.size());
        System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println("Zone date time using clock:"+ZonedDateTime.now(Clock.system(ZoneId.of("America/New_York"))));

        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("LocalDateTime using zone "+now);
        LocalDateTime clock = LocalDateTime.now(Clock.system(ZoneId.of("America/New_York")));
        System.out.println("LocalDateTime using clock"+clock);

        //LocalDateTime and instant convert innto ZoneDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime:"+localDateTime);
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime1"+zonedDateTime1);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime2"+zonedDateTime2);
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime"+offsetDateTime);
    }
}
