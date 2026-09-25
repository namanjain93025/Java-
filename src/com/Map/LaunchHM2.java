package com.Map;

import java.util.*;

public class LaunchHM2 {
    public  static  void main(String[] args){
        HashMap<Integer , String>mp = new HashMap<>();
        mp.put(12,"Naman");
        mp.put(13,"Jain");
        mp.put(14,"Spring");
        mp.put(null,"Hii");
        mp.put(43,null);
        Collection<String> values = mp.values();
        Collection<Integer>key = mp.keySet();
         Iterator itr= values.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
         System.out.println("***********************************");
        Iterator kitr= key.iterator();
        while (kitr.hasNext()){
            System.out.println(kitr.next());
        }
        System.out.println("********+++++++++++++++++++++++++++++***************************");
        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("********+++++++++++++++++++++++++++++***************************");
        Set<Map.Entry<Integer, String>> s=mp.entrySet();
        Set st=mp.entrySet();
        Iterator sitr =st.iterator();
        while (sitr.hasNext()){
            Map.Entry i =(Map.Entry) sitr.next();
            System.out.println("key : "+i.getKey()+ " Value : "+i.getValue());
        }
         Iterator<Map.Entry<Integer,String>> mitr= s.iterator();
         while (mitr.hasNext()){
             System.out.println(mitr.next());
         }


    }
}
