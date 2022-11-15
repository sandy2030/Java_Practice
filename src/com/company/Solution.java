package com.company;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // 1, 3, 6, 4, 1, 2
        // 5 8 12 41 62
        int A[]={-1,-5};//{1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        HashSet<Integer> set=new HashSet<>();
        boolean flag=false;
        int result=0;
        for(int i=0;i<A.length;i++){
            set.add(A[i]);

        }
        Object[] objects = set.toArray();
        Arrays.sort(objects);

        for (int i = 0; i <objects.length ; i++) {
            if ((Integer)objects[i]>0)
                flag=true;
            int s=(Integer)objects[i]+1;
            if (set.contains(s)){
                continue;
            }
            else {
                result = s;
                break;
            }
        }

        if (!flag)
            return 1;

        return result;
    }
}

