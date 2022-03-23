package com.learnjava.numberstream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(0, 5)
                .mapToObj(i ->
                        new Integer(i))
                .collect(Collectors.toList());
    }
    public static long mapToLong(){
        return IntStream.rangeClosed(0, 5)
                .mapToLong(i ->i)
                .count();
    }
    public static OptionalDouble mapToDouble(){
        return IntStream.rangeClosed(0, 5)
                .mapToDouble(i -> i)
                .reduce(Double::sum);
    }

    public static void main(String[] args) {
        System.out.println("mapToObj" + mapToObj());
        System.out.println("mapToLong"+mapToLong());
        System.out.println("mapToDouble" + (mapToDouble().isPresent() ? mapToDouble().getAsDouble() : 0.0));
    }
}
