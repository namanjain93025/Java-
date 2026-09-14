package com.classInsideClass;
abstract class  P{
    abstract public void show();
}

class R extends P{

    public  void show(){
        System.out.println("in show R");
    }
}
//@functionalInterface
interface City{
    void show();
    //functional interface : interface with single method
    default void getData(){
        System.out.println("hi i am nanan");
    }
    String toString();
}
public class LambdaExp {

    public static  void main(String[] args){

        //        P obj = new P(){
//            public void show(){
//                System.out.println("inside the show of main");
//            }
//        };
//        obj.show();

//    City c = new City(){
//      public void show(){
//
//      }
//    };

City cit = ()->System.out.println("this is city");
cit.show();
cit.getData();
        System.out.println(cit.toString());
    }
}
