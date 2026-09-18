package com.Collections;
class Generics<T>{
    private  T ref;
    public Generics(T ref){
        this.ref = ref;
    }
    public  void  disp(){
        System.out.println("the type of t it : "+ref.getClass().getName());
    }
    public T getRef(){
        return ref;
    }
}
//this is sample generics for demo
public class LaunchGenerics2 {
 public static void main(String[] args){
      Generics<Integer> g = new Generics<>(33);
        g.disp();
        System.out.println(g.getRef());
        Generics<String> gr = new Generics<>("aman");
//     Generics<Integer> ge = new Generics<>("Naman");//error
//
 }
}
