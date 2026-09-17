package com.Exception.class1;

import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends Exception{
    OverAgeException(String msg){
        super(msg);
    }
}

class Age{
    int age ;
     public void input() throws OverAgeException, UnderAgeException {
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
         this.age =age;
     }
     public  void verify() throws UnderAgeException, OverAgeException {
         if(age <18){
             OverAgeException oae = new OverAgeException("you are to small ");
             throw  oae;
         }else if(age >65){
             UnderAgeException uae = new UnderAgeException("you are over age");
             throw uae;
         }else{
             System.out.println("you are accepted");
         }
     }


}
class RTO{
    public void start(){
        Age a = new Age();
        try{
            a.input();
            a.verify();
        }catch (UnderAgeException | OverAgeException e){
            System.out.println("Please try aagain");
            try{
                a.input();
                a.verify();
            }catch (UnderAgeException | OverAgeException e1){
                System.out.println("You lost attemp");
            }
        }
    }
}
public class LaunchEH11 {
    public static void main(String[] args){
        RTO r = new RTO();
        r.start();
    }
}
