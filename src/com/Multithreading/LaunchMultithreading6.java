package com.Multithreading;
import java.lang.Thread;
class Car implements  Runnable {
    @Override
    synchronized public void run() {
        String s = Thread.currentThread().getName();
        System.out.println(s+" is inside parking lot ");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

            System.out.println(s + " is driving Car        ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(s + " is Came back after driving ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(s + " parked the car in lot ");
        }
    }


public class LaunchMultithreading6 {
    public static void main(String[] args) throws InterruptedException {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 =new Thread(c);
        t1.setName("Ramesh");
        t2.setName("Suresh");
        t3.setName("Jitesh");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

    }
}
