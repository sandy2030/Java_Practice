package com.multithreading;


import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWN {
    public static void main(String[] args) throws InterruptedException {
        PC pc=new PC();
        Runnable t1=()->{
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable t2=()->{
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread tx=new Thread(t1);
        Thread ty=new Thread(t2);
        tx.start();
        ty.start();
        tx.join();
        ty.join();
    }

}

class PC{
    List<Integer> list=new ArrayList<>();
    int UPPER=5;
    int LOWER=0;
    int value=0;

    void produce() throws InterruptedException {
        while (true){
            synchronized (this){
                while (list.size()==UPPER){
                    wait();
                } // end of while
                list.add(value++);
                System.out.println("produce: "+value);
                notify();
                Thread.sleep(2000);
            } // end synchronized
        }// end while
    }

    void consume() throws InterruptedException {
        while (true){
            synchronized (this){
                while (list.size()==LOWER){
                    wait();
                }
                Integer remove = list.remove(list.size() - 1);
                System.out.println("consume: "+remove);
                notify();
                Thread.sleep(2000);
            }
        }
    }

}