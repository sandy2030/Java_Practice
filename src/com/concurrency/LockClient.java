package com.concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LockClient {

    public static void main(String[] args) {

        ExecutorService service=null;
        try {
            service= Executors.newFixedThreadPool(2);
            RentrantLockDemo counter=new RentrantLockDemo();
            Runnable r1=()->{
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
            };

            Runnable r2=()->{
                for (int i = 1; i <= 2000; i++) {
                    counter.increment();
                }
            };

            Instant now1 = Instant.now();
            service.submit(r1);
            service.submit(r2);
            Instant now2 = Instant.now();
            service.awaitTermination(1, TimeUnit.SECONDS);
            System.out.println("--> "+counter.getCount()+" time "+ Duration.between(now1,now2).toMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (null!=service){
                service.shutdown();
            }
        }
    }
}
