package com.String;

public class LaunchStringMutable2 {

    public static void main(String[] args){
            StringBuffer sb1 = new StringBuffer();
            System.out.print(sb1.capacity());//16
        sb1.append("Sachin");
        sb1.append("Tendulkar India ");
        //new capacity = (old capacity *2+2)
        //when ever any extra char comes then above formula

        StringBuilder sb2 = new StringBuilder();
        System.out.print(sb2.capacity());//16
    }
}
