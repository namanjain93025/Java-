package com.Multithreading;
class MSWord implements Runnable{
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("SPELL")){
            try {
                spellChecking();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else if(name.equals("TYPE")){
            try {
                while(true){
                    typeing();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                while (true){
                    savig();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void typeing() throws InterruptedException {

        for(int i=0;i<3;i++){
            Thread.sleep(4000);
            System.out.println("typing");
        }
    }
    public void spellChecking() throws InterruptedException {

        for(int i=0;i<3;i++){
            Thread.sleep(4000);
            System.out.println("spell Checking");
        }
    }
    public void savig() throws InterruptedException {

        for(int  i=0;i<3;i++){
            Thread.sleep(4000);
            System.out.println("auto Saving");
        }
    }
}
public class LaunchMultithreading9 {
    public static void  main (String[] args) throws InterruptedException {
        MSWord m =new MSWord();
        Thread t1 =new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.setName("SPELL");
        t2.setName("TYPE");
        t3.setName("SAVE");
        t3.setDaemon(true);
        t2.setDaemon(true);
        t2.setPriority(4);
        t3.setPriority(3);

        t1.start();

        t2.start();
        t3.start();
        t1.join();
//        t2.join();
//        t3.join();
        //though these t2,t3 thread required to execute infinite time but they will only execute for till t1 amd main does it exe completely
     System.out.println("Application terminated----------------------");
    }
}
