package com.Multithreading;

public class LaunchDebugger3 implements Runnable {

    public static void main(String[] args) throws InterruptedException {
           LaunchDebugger2 l1 =new LaunchDebugger2();
//         LaunchDebugger2 l2 = new LaunchDebugger2();
           Runnable r = ()->System.out.println("This is run first");
           Thread t1= new Thread(l1);
           Thread t2 = new Thread(()->System.out.println("This is run second"));
            t1.start();
            t2.start();
            t1.join();
            t2.join();
    }
    public void run(){
    System.out.println("This is run ");
    }
}
