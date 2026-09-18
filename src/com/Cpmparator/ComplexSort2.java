package com.Cpmparator;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
    int age;
    int id ;
    String name;
    Student1(int a ,int i,String s){
        this.age =a;
        this.id =i;
        this.name =s;
    }
    public String toString(){
        return "Student1 : [ id : "+id+" age :"+age+" Name :"+name+" ]";
    }

    @Override
    public int compareTo(Student1 o) {
        if(this.age < o.age)return 1;
        else  return -1;
    }
}
public class ComplexSort2 {

    public static void main(String[] args){
        ArrayList<Student1> al = new ArrayList<>();
        al.add(new Student1(101,92,"Naman "));
        al.add(new Student1(102,32,"Aman"));
        al.add(new Student1(103,42,"Ayush"));
        al.add(new Student1(104,22,"Rahul"));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
