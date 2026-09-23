package com.Oops.tut1;
 class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public double add(int a,int b,int c){
        return (double)a*b*c/2;
    }
}
public class CompileTimePoly {

    public static void main(String[]args){
    Calc c = new Calc();
    System.out.println(c.add(4,6));
    System.out.println(c.add(1,7,3));
    int n = Integer.MAX_VALUE;
    System.out.println(n);
    Integer b;
        b = new Integer(23);
        System.out.println(b);
        /*
*
* */
    }
}
