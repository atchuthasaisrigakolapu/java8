package com.learnjava.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, 03, 29);
        LocalDate localDate2 = LocalDate.of(2022, 9, 29);
        Period until = localDate.until(localDate2);
        System.out.println("until.getDays()"+until.getDays());
        System.out.println("until.getMonths()"+until.getMonths());
        System.out.println("until.getYears()"+until.getYears());

        Period period = Period.ofDays(10);
        System.out.println("period.getDays()"+period.getDays());
        Period period2 = Period.ofYears(10);
        System.out.println("period2.getYears()"+period2.getYears());

        Period periodBetween = Period.between(localDate, localDate2);
        System.out.println("periodBetween :"+periodBetween.getDays() + ":"+periodBetween.getMonths()+":"+periodBetween.getYears());

    }
}
