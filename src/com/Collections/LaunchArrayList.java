package com.Collections;

import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(4.23);
        al.add(true);
        al.add("Naman");
        System.out.println(al);
        //dynamic in size unbounded
        //dulicate allowe , insertion order is maintained
        //index based access , to reach any index you have
        System.out.println(al);
    }
}
