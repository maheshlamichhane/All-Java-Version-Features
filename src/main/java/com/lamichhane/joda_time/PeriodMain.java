package com.lamichhane.joda_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1994, 11, 9);
        LocalDate today = LocalDate.now();
        Period r = Period.between(birthday, today);

        System.out.printf("Your age is %d years %d months and %d days",r.getYears(),r.getMonths(),r.getDays());


        LocalDate deathDate = LocalDate.of(1994+60, 8, 28);
        Period p1 = Period.between(today, deathDate);
        int d = p1.getYears() * 365 + p1.getMonths() *30 + p1.getDays();
        System.out.println();
        System.out.printf("You will be on earth only %d days hurry up to do more important things",d);
    }
}
