package com.supplier;

/**
 * Created by sande on 26-11-2022.
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        {
            System.out.println("jjj");
        }
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
