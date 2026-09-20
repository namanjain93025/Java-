package com.Multithreading;


import java.util.Scanner;
class Alpha1 implements Runnable{
    @Override
    public void run(){
        bank();
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
}
class Beta1 implements Runnable{
    public void run(){
        try {
            printingStar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void printingStar() throws InterruptedException {
        System.out.println("Printing activity started..");
        for (int i =0;i<=4;i++){
            System.out.println("***");
            Thread.sleep(5000);
        }
        System.out.println("Printing activity terminated");

    }
}
class Gamma1 implements Runnable{
    public void run(){
        try {
            message();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
public class LaunchMultithreading4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started");

        Alpha1 a1 = new Alpha1();
        Beta1 b1 = new Beta1();
        Gamma1 g1 = new Gamma1();
        //it is require to create thred now since these object does not have any relation with thread
        Thread a = new Thread(a1);
        Thread b = new Thread(b1);
        Thread g = new Thread(g1);

        //we created three thread since creating onject of chid is eqaul to creating object of parent Thread class
        //start() tells the JVM that the thread can begin execution.
        // The JVM's thread scheduler decides when each thread actually gets CPU time
        System.out.println(a.isAlive());//fasle
        System.out.println(b.isAlive());//fasle
        System.out.println(g.isAlive());//fasle
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        System.out.println(g.getPriority());
        a.start();
        b.start();
        g.start();
        a.join();
        b.join();
        g.join();
        System.out.println(a.isAlive());//t
        System.out.println(b.isAlive());//t
        System.out.println(g.isAlive());//t
        System.out.println("Application Terminated..");
        /*
        *
        * */
    }
}


