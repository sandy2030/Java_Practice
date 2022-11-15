package com.company;

import java.util.Arrays;

/*
* clockwise rotation or right rotation
* input array 1,2,3,4,5
* after rotate by 2
* output 5,1,2,3,4
*

* 1,2,3,4,5
* 5,1,2,3,4
* 4,5,1,2,3
* */
public class RightArrayRotation {
    public static void main(String[] args) {
        Integer input[]={1,2,3,4,5};
        // right rotate array by d
        int d=2;
        if (d<=input.length)
        leftRotation(input,d);
        else
            throw new IndexOutOfBoundsException("wrong index");
    }
    private static void leftRotation(Integer input [],int d) {
        for (int j=input.length;j>d;j--){
            int temp=input[0];
            for (int i=0;i<input.length-1;i++){
                input[i]=input[i+1];
            }
            input[input.length-1]=temp;
        }

        Arrays.stream(input).forEach(s-> System.out.print(s+","));
    }

}