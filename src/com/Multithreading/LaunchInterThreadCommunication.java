package com.Multithreading;
class Producer extends Thread{
    Queue q ;
    public Producer(Queue q){
        this.q = q;
    }
    int i =1;
    @Override
    public void run(){
        while (true){
            try {
                q.produce(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer extends Thread{
    Queue q;
    public Consumer(Queue q){
        this.q = q;
    }
    @Override
    public void run(){
        while (true){
            try {
                q.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Queue {
    boolean flag= false;
    int i ;
    synchronized  void produce(int i) throws InterruptedException {
        if(flag==false){
            this.i = i;
            System.out.println("Producer produced thread " + this.i);
            flag =true;
            this.notify();
        }else{

            System.out.println("Producer is waiting for consumer to consume ");
            this.wait();
        }
    }
    synchronized void consume() throws InterruptedException {
        if (flag==true){
            System.out.println("consumer consumed thread " + i);
            flag= false;
            this.notify();
        }else{

            System.out.println("Consumer is waiting for producer to produce ");
            this.wait();
        }
    }
}
public class LaunchInterThreadCommunication {
    public  static void main(String[] args) throws InterruptedException {
        System.out.println("Producer and consumer problem started");
        Queue q = new Queue();
        Producer p = new Producer(q);//p thread
        Consumer c = new Consumer(q);//q thread
        p.start();
        c.start();
        p.join();
        c.join();

        System.out.println("Producer and consumer problem ended");

    }
}
