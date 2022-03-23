package com.learnjava.numberstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberStreamBoxingUnboxingExample {
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(0, 10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unBoxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing"+boxing());
        System.out.println("Unboxing"+unBoxing(Arrays.asList(1,2,3,4,5)));
    }
}
