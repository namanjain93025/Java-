package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class LaunchIterator {
    public static  void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add("naman");

//        for (int i=0;i<al.size();i++){
//            System.out.println(al.get(i));
//            al.add(30);//infinite loop
//
//        }
//        for (Object it : al){
//            System.out.println(it);//ConcurrentModificationException
//           al.add("hi");
//        }
//        this is called as Fail Fast exception
        Iterator it = al.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
            al.add(40);//concurrentModification Exception

        }


    }
}
