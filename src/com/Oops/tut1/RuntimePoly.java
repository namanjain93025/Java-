package com.Oops.tut1;
class  Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
    void run(){
        System.out.println("Animal is running");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("lion makes roar");
    }
    void run(){
        System.out.println("lion  is running");
    }
    void eat(){
        System.out.println("lion is eating");
    }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger makes roar");
    }
    void run(){
        System.out.println("Tiger  is running");
    }
}
class Sample{
    void f(Animal a){
        a.run();
        a.sound();
    }
}
public class RuntimePoly {
    public static  void main(String []args){
        //runtime polymorphism
        Animal a = new Lion();
        Animal b = new Tiger();
        a.run();
        a.sound();
        ((Lion)a).sound();
        ///////////////////////////////////
        ((Lion) a).eat();//downcasting
        b.run();
        b.sound();
        /*lion  is running
        lion makes roar
        lion is eating
        Tiger  is running
        Tiger makes roar
        */


//        Lion l =new Lion();
//        Tiger t = new Tiger();
//        Sample s = new Sample();
//        s.f(l);
//        s.f(t);
//        /*lion  is running
//lion makes roar
//Tiger  is running
//Tiger makes roar
//*/
    }
}
