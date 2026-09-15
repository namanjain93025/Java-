package com.String;

public class lauchString2 {
    public static  void main (String[] args){
       //compare to method compares lexographically two strings
        String s1 = "Naman";
        String s2 = "Aman";
        int res = s1.compareTo(s2);
        System.out.println(res);
     //
     String str = " Raja Ram Mohan Roy ";
     String [] arr = str.split(" ");
     for (String s : arr){
         System.out.println("_" + s);
     }
        System.out.println(str.toUpperCase());//Naman
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.indexOf('a'));
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3));
    }
}
