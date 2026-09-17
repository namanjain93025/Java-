package com.Exception.class1;

import java.util.Scanner;

class InvalidUserException extends Exception {
    InvalidUserException(String msg){
        super(msg);
    }

}
class Credential{
    int pw = 123;
    int acc = 3434;


    public void  isVlaid() throws InvalidUserException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account");
        int acco = sc.nextInt();
        System.out.println("Enter the psward");
        int psw = sc.nextInt();
        if(psw !=pw || acco !=acc){
            InvalidUserException iue = new InvalidUserException("Invalid user");
            iue.getMessage();
            throw iue;
        }
        System.out.println(" User Verified ");
    }

}
class Bank{
    public void innitiateTrx(){

        Credential c = new Credential();
        try{

           c.isVlaid();
        }catch (InvalidUserException e){
            try{
                c.isVlaid();

            }catch (InvalidUserException e1){
                try{
                    c.isVlaid();
                }  catch (InvalidUserException e2){
                        System.out.println("All tries are done");
                }
            }
        }
    }
}
public class LaunchEH10 {

    public static void main(String[] args){
            Bank b  = new Bank();
            b.innitiateTrx();
    }
}
