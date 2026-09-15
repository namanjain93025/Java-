package com.Exception.class1;

import java.util.Scanner;

public class LaunchEH3 {

    public static void main(String[] args){

        System.out.println("Connection established");
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num ");
            int n = sc.nextInt();
            System.out.println("Enter deno");
            int d = sc.nextInt();
            System.out.println("Ans is : " + (n / d));
            System.out.println("Enter the size of array");
            int l = sc.nextInt();
            System.out.println("Enter the pos ");
            int p = sc.nextInt();
            int arr[] = new int[l];
            System.out.println("Enter the val");
            arr[p] = sc.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter valid index");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Enter positive index");
        }
        catch (ArithmeticException e){
            System.out.println("Enter non zero num");
        }
        catch (Exception e){//this can only be places at the last ,
            System.out.println("Error ocuured");
        }
        System.out.println("Connection ended");
    }
}
