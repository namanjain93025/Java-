package com.classInsideClass;
interface  Add{
    void add(int a ,int b);
}
public class LambadaEx2 {
    public static void main(String[] args){
        Add a = (c, b) ->
        {
            System.out.println("sum is " +( c + b));
        };
        a.add(4, 3);
    }
}
