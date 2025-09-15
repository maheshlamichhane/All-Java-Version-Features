package com.lamichhane.joda_time;

import java.time.LocalDateTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime myfulldate = LocalDateTime.of(1994,11,9,12,45,30,600000);
        int year = myfulldate.getYear();
        int month = myfulldate.getMonthValue();
        int day = myfulldate.getDayOfMonth();
        int hour = myfulldate.getHour();
        int minutes = myfulldate.getMinute();
        int seconds = myfulldate.getSecond();

        System.out.println("Current Date and Time ="+now);
        System.out.println("My Customized Date and Time ="+day+"/"+month+"/"+year+ " "+hour+":"+minutes+":"+seconds);
    }
}
