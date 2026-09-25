package com.Cpmparator;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student{
     int age;
     int id ;
     String name;
    Student(int a ,int i,String s){
        this.age =a;
        this.id =i;
        this.name =s;
    }
    public String toString(){
        return "Student : [ id : "+id+" age :"+age+" Name :"+name+" ]";
    }
}
//to sort such  complex objects it is require to use comparator interface
//class Alpha implements Comparator {
//
//    @Override
//    public int compare(Object o1, Object o2) {
//
//        Student s1 = (Student) o1;
//        Student s2 = (Student) o2;
//
//        if (s1.age > s2.age) {
//            return -1;   // s1 before s2 → descending
//        }
//        else if (s1.age < s2.age) {
//            return 1;    // s1 after s2
//        }
//        else {
//            return 0;    // equal
//        }
//    }
//}

//class Alpha implements Comparator<Student> {
//
//    @Override
//    public int compare(Student s1,Student s2) {
//
//
//        if (s1.age > s2.age) {
//            return -1;   // s1 before s2 → descending
//        }
//        else if (s1.age < s2.age) {
//            return 1;    // s1 after s2
//        }
//        else {
//            return 0;    // equal
//        }
//    }
//}

public class ComplexSort {
    public static void main(String[] args){
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101,92,"Naman "));
        al.add(new Student(102,32,"Aman"));
        al.add(new Student(103,42,"Ayush"));
        al.add(new Student(104,22,"Rahul"));
//        Alpha a = new Alpha();
        System.out.println(al);
//        Collections.sort(al,new Comparator<Student>(){
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.id < o2.id){
//                    return -1;
//                }else return  1;
//            }
//
//        });
        Collections.sort(al,(o1 ,o2)->{
                  if(o1.id < o2.id){
                    return -1;
                }else return  1;
        });
        System.out.println(al);
    }
}
