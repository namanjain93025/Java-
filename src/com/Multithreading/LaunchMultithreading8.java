package com.Multithreading;
///deadlock
class Library implements Runnable{
    String res1 = new String("DSA");
    String res2 = new String("DBMS");
    String res3 = new String("oops");


    public void run(){
       String s=Thread.currentThread().getName();
       if(s.equals("Student1")){

           try{
               Thread.sleep(4000);
               synchronized (res3) {
                   System.out.println(s + " has acquired " + res3);
                   Thread.sleep(4000);
                   synchronized (res2) {
                       System.out.println(s + " has acquired " + res2);
                       Thread.sleep(4000);
                       synchronized (res1) {
                           System.out.println(s + " has acquired " + res1);
                       }
                   }
               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }else{
           try{
               Thread.sleep(4000);
               synchronized (res1) {
                   System.out.println(s + " has acquired " + res1);
                   Thread.sleep(4000);
                   synchronized (res2) {
                       System.out.println(s + " has acquired " + res2);
                       Thread.sleep(4000);
                       synchronized (res3) {
                           System.out.println(s + " has acquired " + res3);
                       }
                   }
               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }

}

public class LaunchMultithreading8 {
    public static void main(String[] args) throws InterruptedException {
        Library lib =new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        t2.setName("Student2");
        t1.setName("Student1");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
