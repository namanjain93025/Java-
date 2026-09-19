package com.Multithreading;

public class LaunchMultithreding {
    public  static void main(String[] args) throws InterruptedException {
        System.out.println("appl. started ....");
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        Thread.sleep(3000);
        thread.setPriority(4);
        thread.setName("Naman");
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println("Appl terminated...");
    }

}
