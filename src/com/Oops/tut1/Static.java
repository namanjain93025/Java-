package com.Oops.tut1;
class A1{
    int a =20;
    {
        System.out.println("This is non static block of parent ");
    }
    public A1 (){
        System.out.println("This is parent constructor");
    }
}
class B1 extends A1{
    static int q =20;
    static  {
        q =20;
        System.out.println(" inside static bloc of child class "+q);
    }
    {
        System.out.println("This is non static block of child");
    }
    public B1 (){
        System.out.println("This is child constructor");
    }
}
public class Static {
       //static keyword will be used for method ,block , function
       // static block exe during class  loading
       // static method and variable belong to class  , memory is allocated during class creation
       //
      //
    public static void main(String[] args){
        B1 b = new B1();
//        System.out.println();
    }
    }
