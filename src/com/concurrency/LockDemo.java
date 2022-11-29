package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class LockDemo {
static AtomicInteger ticketsAvailable=new AtomicInteger(1);

    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        Thread t1=new Thread(()->{
            lock.lock();
            if (ticketsAvailable.get()>0) {
            bookTicket();
            ticketsAvailable.decrementAndGet();
            System.out.println("i for t1 " + ticketsAvailable.get());
            lock.unlock();
        }
        });
        Thread t2=new Thread(()->{
            lock.lock();
            if (ticketsAvailable.get()>0) {
            bookTicket();
            ticketsAvailable.decrementAndGet();
            System.out.println("j for t2 " + ticketsAvailable.get());
            lock.unlock();
        }
        });
        t1.start();
        t2.start();
    }

    static void bookTicket(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ticket booked by "+Thread.currentThread().getName()+" :: "+ticketsAvailable);
    }
}
