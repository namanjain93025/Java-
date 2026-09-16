package com.Exception.class1;
class Gamma{

    public int func(){
        try{
            System.out.println("Inside fnuunc");
            return 10;
        }
        finally {
            System.out.println("inside the finally ");
            return 20;
        }
    }
}

public class LaunchEH6 {

    public  static void main(String[] args){
         Gamma g = new Gamma();
         System.out.println(g.func());
         //output will be 20 ...........................................
    }
}
