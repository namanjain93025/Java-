package com.Multithreading;
import java.util.Scanner;
import  java.lang.Thread;

class Alpha2 implements Runnable{


    @Override
    public void run(){
        String s = Thread.currentThread().getName();
        System.out.println(s);
        if(s.equals("Bank")){
                bank();
        }else if(s.equals("Star")){
                try {
                    printingStar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }else if(s.equals("Message")) {
                try {
                    message();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }
    public void bank(){
        System.out.println("Baning activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name ans pasw");
        int un = sc.nextInt();
        int pw = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Bank ativity terminated");
    }
    public void printingStar() throws InterruptedException {
        System.out.println("Printing activity started..");
        for (int i =0;i<=4;i++){
            System.out.println("***");
            Thread.sleep(5000);
        }
        System.out.println("Printing activity terminated");

    }
    public void message() throws InterruptedException {
        System.out.println("Printing the imp message..");
        for (int i =0;i<=4;i++){
            System.out.println("Focus is the key to master any skills ");
            Thread.sleep(4000);

        }

        System.out.println("Printing imp meassage terminated");
    }
}
public class LaunchMultithreading5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started ");
        Alpha2 a= new Alpha2();
        Thread t1 =new Thread(a);
        Thread t2 =new Thread(a);
        Thread t3 =new Thread(a);
        t1.setName("Bank");
        t2.setName("Star");
        t3.setName("Message");
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();  this will prevent multithreading since main will wait untill  t1 will execution ,after t1 finishes then main will reach  t2.start()
//        t3.join();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("Application End");
    }
}
