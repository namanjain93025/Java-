package com.Multithreading;

import java.util.Scanner;

public class LaunchMultithreading2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started");

        System.out.println("Baning activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name ans pasw");
        int un = sc.nextInt();
        int pw = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Bank ativity terminated");

        System.out.println("Printing activity started..");
        for (int i =0;i<=4;i++){
            System.out.println("***");
        }
        System.out.println("Printing activity terminated");

        System.out.println("Printing the imp message..");
        for (int i =0;i<=4;i++){
            System.out.println("Focus is the key to master any skills ");
            Thread.sleep(4000);

        }

        System.out.println("Printing imp meassage terminated");
        System.out.println("Application Terminated..");
    }
}
