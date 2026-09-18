package com.DateAndTime;

//import java.util.Date;

import java.sql.Date;

public class DateAndTime {
    public static void main(String[] args){
//        Date d = new Date();
//        System.out.println(d.getDate());
//        System.out.println(d.toString());
        long ms = 12339994L;
        Date d = new Date(ms);
        System.out.println(d.toString());

    }
}
