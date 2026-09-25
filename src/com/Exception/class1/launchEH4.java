package com.Exception.class1;

import java.util.Scanner;

class Alpha{

    public void calc (){
        System.out.println("Inside alpha class");
//        try{
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            n = sc.nextInt();
            System.out.println("Enter the denominator");
            int d = sc.nextInt();
            int res = n / d;
//        }catch (Exception e){
//            System.out.println("Some error ocuured");
//        }
        System.out.println("terminate alpha class");

    };

}
class Beta{
    public void f(){
        System.out.println("Inside beta");
        Alpha a = new Alpha();
        try{
            a.calc();
        }catch (Exception e){
            System.out.println("Some eror ");
        }
        System.out.println("Terminate beta class");
    }
}
public class launchEH4 {

    public static void main (String[] args){
        System.out.println("Inside main class -------------");
         Beta b = new Beta();
         b.f();
        System.out.println("Terminate main class ----------");
    }
}
