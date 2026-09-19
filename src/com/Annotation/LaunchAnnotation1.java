package com.Annotation;
abstract class Animal {
    public  void function(){
        System.out.println("Animal is Eating ");
    }

    //overriding function
    public abstract void functin();
}
class Tiger extends Animal{
    //overriding function
    @Override
    //tell the compiler also so that no mistake could happen
    public void functin(){
        System.out.println("Tiger eat flash and run **");
    }
}
public class LaunchAnnotation1 {
    public static void main(String[] args){

    }
}
