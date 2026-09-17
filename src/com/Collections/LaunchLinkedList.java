package com.Collections;

import java.util.LinkedList;

public class LaunchLinkedList {

        // implementing  list , deque
     public static void main (String[] args){
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add("Naman");
        ll.add(true);
        ll.add('1');
        ll.add(1.9);
        System.out.println(ll);
        ll.add(0,200);
        ll.addAll(ll);
        System.out.println(ll);
        ll.offer(1010);//offer mean it will offer ,but might be chance ll may not add it
        System.out.println(ll.peek());//give the first val without removing it
        System.out.println(ll.poll());//give the first val, also removes it





    }

}
