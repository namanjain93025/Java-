package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
    Integer id;
    String name;
    Employee(int id ,String nama){
        this.id = id;
        this.name = nama;
    }
    public String toString(){

        return "[ name "+ name+" id "+id+  " ]";
    }
}
public class LaunchGenerics{
    public static void main (String[] args){
        //to include tye sfety we use generics
        ArrayList<Integer>al = new ArrayList<>();
        al.add(12);al.add(23);al.add(45);al.add(65);
//        System.out.println(al);
//        al.add("tt")//not ;

        for (Integer it: al){
             System.out.println(it);
         }
        ArrayList<Employee>emp = new ArrayList<>();
        emp.add(new Employee(123,"Naman"));
        emp.add(new Employee(12 ,"darshan"));

        Iterator itr = emp.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Employee e : emp){
            System.out.println(e);
        }
    }
}
