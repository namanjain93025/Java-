package com.Collections;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFailSafe {
    public static void main(String[] args){
        //to handle the concurrent modification safely by use of package concurrent
        CopyOnWriteArrayList li = new CopyOnWriteArrayList();

        li.add(20);
        li.add("naman");
        li.add(40);
        li.add(true);
        li.add("jain");

//        ListIterator litr = li.listIterator();
//        while (litr.hasNext()){
//            System.out.println(litr.next());
//        }
//
        ListIterator litr = li.listIterator(li.size());
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }


    }
}
