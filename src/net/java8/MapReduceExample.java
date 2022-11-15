package net.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,78,9,322,22,0,123);
        // Map is used to Transforming data
        // Reduce is used to aggregating data i.e. combine stream elements and  produce single value

        // Ex Stream: [2,4,6,7,8,9,12] find sum of numbers present in stream

        // Map() -> Transform Stream<Object> to Stream<Int>
        // Reduce -> combine stream of int and produce sum of result
        Stream<Integer> stream = list.stream();
       // List<Integer> collect = stream.map(i -> i*2).sorted().collect(Collectors.toList());
        //System.out.println(collect);
        int sum = stream.mapToInt(i -> i).sum();
        System.out.println(sum);
        
    }
}
