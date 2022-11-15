package com.company;


public class SubStrOfDistinctChar {
    public static void main(String args[]){
        SubStrOfDistinctChar s=new SubStrOfDistinctChar();
        int count=s.countGoodSubstrings("aababcabc");
        System.out.println("count= "+count);
    }

    public int countGoodSubstrings(String s) {
        int count =0;
        String str="";
        for(int i=0;i<s.length()-2;i++){
            str=s.substring(i,i+3);
            if(isValid(str))
                count++;
        }
        return count;
    }

    boolean isValid(String str){
        System.out.println("str= "+str);
        return (str.charAt(0)!=str.charAt(1) &&
                str.charAt(1)!=str.charAt(2) &&
                str.charAt(0)!=str.charAt(2));
    }
}