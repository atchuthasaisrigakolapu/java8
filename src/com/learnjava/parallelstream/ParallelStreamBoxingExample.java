package com.learnjava.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxingExample {
    public static int parallelStream(List<Integer> list){
        long l = System.currentTimeMillis();
        Integer reduce = list.stream()
                .reduce(0, Integer::sum);
        long l1 = System.currentTimeMillis() - l;
        System.out.println("Duration in sequentail stream" + (l1 - l));
        return reduce;
    }
    public static int sequentailStream(List<Integer> list){
        long l = System.currentTimeMillis();
        Integer reduce = list.parallelStream()
                .reduce(0, Integer::sum);
        long l1 = System.currentTimeMillis() - l;
        System.out.println("Duration in sequentail stream" + (l1 - l));
        return reduce;
    }

    public static void main(String[] args) {
        List<Integer> collect = IntStream.rangeClosed(0, 10000)
                .boxed()
                .collect(Collectors.toList());
        parallelStream(collect);
        sequentailStream(collect);
    }
}
