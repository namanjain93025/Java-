package com.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LaunchMap1 {
    public static void main(String[] args){
        //map stores daata in form of key-val pair
        //key and val are object if not specified
        //key will always will be unique
        //Order of insertion is not  maintained in  ,HashMap ,LinkedHashMap
        HashMap hm1 =  new HashMap<>();
        hm1.put(1,"Naman");
        hm1.put("joy",23);
        hm1.put(null,null);
//        hm1.put(null,44);
        hm1.put(44,null);
        System.out.println(hm1);

        LinkedHashMap lhm1 = new LinkedHashMap();
        lhm1.put(2,"this is me");
        lhm1.put(null,30);
        lhm1.put(4,null);
        System.out.println(lhm1);


        /*
HashMap
    ↓
allows one null key + multiple null values

Hashtable
    ↓
does NOT allow null keys or null values
* */
        Hashtable ht1 = new Hashtable();
        ht1.put(1,"Joy");
       // ht1.put(null,"Na");//not allowed  in hashtable
        ht1.put("Naman",34);
        System.out.println(ht1);


    }
}
