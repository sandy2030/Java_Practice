package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sande on 27-11-2022.
 */
public class RentrantLockDemo {

    private final Lock lock=new ReentrantLock();
    private int count =0;

    public void increment(){
        lock.lock();
        try {
            count=count+1;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (null!=lock){
                lock.unlock();
            }
        }
    }

    public int getCount(){
        return count;
    }
}
