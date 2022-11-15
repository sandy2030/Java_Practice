package com.company;

import java.util.Arrays;

/*
* clockwise rotation or left rotation
* input array 1,2,3,4,5
* after rotate by 1
* output 2,3,4,5,1
* */
public class LeftArrayRotation {

    public static void main(String[] args) {
	// write your code here
        Integer input[]={1,2,3,4,5};
        // left rotate array by d
        int d=2;
        if (d<=input.length)
        leftRotation(input,d);
        else
            throw new IndexOutOfBoundsException("wrong index");
    }
    private static void leftRotation(Integer input [],int d) {
        for (int j=0;j<d;j++){
            int temp=input[0];
            for (int i=0;i<input.length-1;i++){
                input[i]=input[i+1];
            }
            input[input.length-1]=temp;
            System.out.println();
            Arrays.stream(input).forEach(s-> System.out.print(s+","));
        }

        //Arrays.stream(input).forEach(s-> System.out.print(s+","));

    }


}
