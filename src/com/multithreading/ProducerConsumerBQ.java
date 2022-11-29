package com.multithreading;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBQ {

    public static void main(String a[]) {
        BlockingQueue<Integer> bqueue
                = new ArrayBlockingQueue<Integer>(4);

        // Create 1 object each for producer
        // and consumer and pass them the common
        // buffer created above
        producer p1 = new producer(bqueue);
        consumer c1 = new consumer(bqueue);

        // Create 1 thread each for producer
        // and consumer and pass them their
        // respective objects.
        Thread pThread = new Thread(p1);
        Thread cThread = new Thread(c1);

        // Start both threads
        pThread.start();
        cThread.start();
    }
}

class producer implements Runnable {

    BlockingQueue<Integer> obj;

    public producer(BlockingQueue<Integer> obj)
    {
        this.obj = obj;
    }

    @Override public void run()
    {
        for (int i = 1; i <= 4; i++) {
            try {
                obj.put(i);
                System.out.println("Produced " + i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class consumer implements Runnable {

    BlockingQueue<Integer> obj;

    int taken = -1;

    public consumer(BlockingQueue<Integer> obj)
    {
        this.obj = obj;
    }

    @Override public void run()
    {
        while (taken != 4) {
            try {
                taken = obj.take();
                System.out.println("Consumed " + taken);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}