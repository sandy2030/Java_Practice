package com.company;

import java.util.stream.Stream;

public class UniqueCharInString {
    public static void main(String[] args) {
        String s="abca";
        String temp="";
        int i=0;
        for (; i < s.length(); i++) {
            if (temp.indexOf(s.charAt(i))==-1){
                temp=temp+s.charAt(i);
            }
        }
        i--;
        System.out.println(i);

        ////////////////////////////    JAVA 8 METHOD TO PRINT UNIQUE CHARS AND COUNT /////////
        s.chars().mapToObj(e -> (char) e).distinct().forEach(x-> System.out.print(x + " "));

        // PRINT COUNT
        System.out.println(s.chars().mapToObj(e -> (char) e).distinct().count());

    }
}
