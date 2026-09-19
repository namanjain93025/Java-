package com.Enum;

import java.util.Collections;

enum Days{
   MON,TUE,WED,THU,FRI,SAT,SUN;//they are varivle as well values

    enum month{
       //We can alson enum inside enum
   }
}
public class Launch1Enum {
    public static void main(String[] args){
     System.out.println(Days.FRI);

     int index = Days.FRI.ordinal();
     System.out.println(index);

     Days[]arr=Days.values();
     for (Days d : arr){
         System.out.println(d.ordinal()+ "  day is "+d);
     }
    }
}
