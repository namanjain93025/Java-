package com.String;

public class LaunchStringMutable1 {
    public static  void main(String[] args){
//        StringBuffer s = new StringBuffer("Naman ");
//        System.out.println(s);
//        s.append("jain");
//        System.out.println(s);

        StringBuilder s = new StringBuilder("Naman ");
        System.out.println(s);
        s.append("jain");
        s.append(12);
        s.append(true);
        System.out.println(s);
    }
}
