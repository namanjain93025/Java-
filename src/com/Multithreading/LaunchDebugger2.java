package com.Multithreading;
import  java.lang.Thread;
public class LaunchDebugger2 extends Thread{
    public  static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started");
        LaunchDebugger2 l1 = new LaunchDebugger2();
        LaunchDebugger2 l2 = new LaunchDebugger2();
        l1.setName("myTherad1");
        l2.setName("myTherad2");
        l1.start();
        l2.start();
        l2.join();
        l1.join();
        System.out.println("Application Ended");
    }
    public  void run(){
        System.out.println("inside the run");
    }
}
