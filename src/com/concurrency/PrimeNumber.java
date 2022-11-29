package com.concurrency;

/**
 * Created by sande on 30-11-2022.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int i=17;
        try {
            checkPrime(i);
        } catch (PrimeNumberException e) {
            System.out.println("msg: "+e.getMessage());
        }
    }

    static boolean checkPrime(int i) throws PrimeNumberException{
        int j=2;
        boolean flag=false;
        while(j<i/2){
            if(i%j==0){
                flag=true;
                System.out.println(i+" is not prime number ");
                break;
            }
            j++;
        }
        if(!flag)
            throw new PrimeNumberException(i+" is prime number");
        return flag;
    }
}

class PrimeNumberException extends Exception{
    public PrimeNumberException(String msg){
        super(msg);
    }
}