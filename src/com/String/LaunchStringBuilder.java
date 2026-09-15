package com.String;

public class LaunchStringBuilder {
    public static  void main(String[] args){
        StringBuilder sb1 = new StringBuilder("Sachin");
        StringBuilder sb2  = new StringBuilder("Sachin");
        System.out.println(sb1.equals(sb2));//false
        //it is comparing addresses  that why getting false
        System.out.println(sb1);//StringBuilder had overridden the obj1
        System.out.println(sb2);//StringBuilder had overridden the obj2
        //only diff b/w both class in sync and async

        /*
        * String
    → immutable
    → equals() compares content
    → toString() returns content

StringBuilder
    → mutable
    → equals() does NOT compare content
    → toString() returns content

StringBuffer
    → mutable
    → equals() does NOT compare content
    → toString() returns content
    → synchronized/thread-safe
        * */
    }
}
