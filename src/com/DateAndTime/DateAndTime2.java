package com.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime2 {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        LocalDate  d = LocalDate.of(2004,8,15);
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalTime t1 = LocalTime.of(22,2);
        System.out.println(t1);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

    }
}
