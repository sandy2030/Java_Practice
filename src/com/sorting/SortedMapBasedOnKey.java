package com.sorting;
import java.util.*;

public class SortedMapBasedOnKey<T> {

    private T t;

    public SortedMapBasedOnKey(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        SortMap();
    }

    private static void SortMap() {
        Map<Integer,String> map=new HashMap<>();
        map.put(10201,"PETER");
        map.put(13001,"KEVIN");
        map.put(10011,"MARK");
        map.put(17000,"AMY");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        ArrayList<Map.Entry<Integer, String>> entries = new ArrayList<>(entrySet);
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        entries.forEach(System.out::println);
    }
}