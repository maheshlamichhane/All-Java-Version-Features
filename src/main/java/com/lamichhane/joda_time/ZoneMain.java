package com.lamichhane.joda_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneMain {

    public static void main(String[] args) {

            ZoneId zone = ZoneId.systemDefault();
            System.out.println("Default Zone ="+zone);
            System.out.println("Nepal Time ="+ LocalDateTime.now());

            ZoneId la = ZoneId.of("America/Los_Angeles");
            ZonedDateTime dt = ZonedDateTime.now(la);

            System.out.println("Los Angles Time="+dt);

    }
}
