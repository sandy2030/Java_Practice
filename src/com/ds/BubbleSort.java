package com.ds;

/**
 * Created by sande on 26-11-2022.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int array[]={52,3,1,23,0,-6};
        bubbleSort(array);
    }

    static void bubbleSort(int [] a){
        int len=a.length;
        int temp=0;
        for (int i=0;i<len;i++){
            for (int j = i+1; j < len; j++) {
                if (a[i]>a[j]){
                   temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       for (int y:a)
           System.out.print(y+" , ");
    }
}
