package com.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LaunchVector {

    public static void main(String[] args){

        Vector v = new Vector();
        v.add(12);
        v.add("naman");
        v.add(true);
        v.add(12.4);

        //earlier enumeration was used for iteration through
        Enumeration itr=v.elements();
        while (itr.hasMoreElements()){
            System.out.println(itr.nextElement());
        }
        //hence vector is called is legacy class in java
        //************************
        Iterator it =  v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
