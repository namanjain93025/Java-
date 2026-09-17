package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LuaunchHashSet {

    public static void main(String[] args){
//        HashSet hs = new HashSet(); does not maintain insertion order
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(12);
        hs.add(23);

        System.out.println(hs);
        /*
        *
        * */
    }
}
