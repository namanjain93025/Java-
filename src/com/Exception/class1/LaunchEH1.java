package com.Exception.class1;

import java.util.Scanner;

public class LaunchEH1 {
    public static void main(String[] args){

        System.out.println("Connection established");

        Scanner scan  = new Scanner(System.in);
        try
        {
            System.out.println("kindly enter the Numerator numerator");
            int a = scan.nextInt();
            System.out.println("kindly enter the Denominator numerator");
            int b = scan.nextInt();
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("Wrong inputs "+e.getMessage()+" ");
        }
    }
}
