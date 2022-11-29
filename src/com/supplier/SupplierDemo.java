package com.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    // T get()  is declare in Supplier interface

    // create Lambda function for supplier functional interface

    public static void main(String[] args) {
        Supplier message=()->{return "No Worries !!!";};

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(message));
    }
}
