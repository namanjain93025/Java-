package com.Collections;

import java.util.ArrayList;
import java.util.List;

class Human{

}
class Student extends Human{

}
class Emp{

}
public class LaunchGenerics3 {
//    private static Object h;

    public static void main(String[] args){

        ArrayList<Human> alh=new ArrayList<>();
        ArrayList<Student> als=new ArrayList<>();
        ArrayList<Emp> elh=new ArrayList<>();
        //alh  = als;//compile time error
        ArrayList<?> alh1=new ArrayList<>();//wildcard generics
        ArrayList<Student> als1=new ArrayList<>();
        ArrayList<Emp> elh1=new ArrayList<>();
        alh1  = als1;//no ce

        ArrayList< ? extends  Human> alh2=new ArrayList<>();//upperbound human , either human or its child
        ArrayList<Student> als2=new ArrayList<>();
        ArrayList<Emp> elh2=new ArrayList<>();
        ArrayList<Object> alo2=new ArrayList<>();
        alh2  = als2;
       // alh2 = alo2;//ce
        // alo2  = alh2//ce

        ArrayList< ? super   Human> alh3=new ArrayList<>();//lowebound human , either human or its parent
        ArrayList<Student> als3=new ArrayList<>();
        als3.add(new Student());
        ArrayList<Emp> elh3=new ArrayList<>();
        ArrayList<Object> alo3=new ArrayList<>();
//        alh3  = als2; //ce
         alh3 = alo2;
//         alo3  = alh3//ce
        LaunchGenerics3.print(als3);

    }
    public static void print(List< ? extends Human >li){
        for( Human h : li){
            System.out.print(h);
        }
    }

}
