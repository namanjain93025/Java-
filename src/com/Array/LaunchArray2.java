package com.Array;
class Telusko{
    int price;
    String name;

    public Telusko(int p,String n){
        this.name= n;
        this.price=p;
    }
    @Override
    public String toString(){
        return "Telusko { name : "+name+" price :  "+price+" ";
    }
}
public class LaunchArray2 {
    public static void  main(String[] args){
        Telusko t = new Telusko(3000, "Java");
        System.out.println(t);
    }
}
