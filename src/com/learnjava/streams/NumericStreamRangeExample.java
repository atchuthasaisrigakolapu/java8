package com.learnjava.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Range Count"+intStream.count()) ;
        IntStream.range(1,50).forEach(value-> System.out.print(value+","));
        System.out.println();
        IntStream intStreamRange = IntStream.rangeClosed(1,50);
        System.out.println("Range Closed Count"+intStreamRange.count());
        IntStream.rangeClosed(1,50).forEach(System.out::print);
        System.out.println();
        LongStream longStream = LongStream.range(1, 50);
        System.out.println("Range count with long"+longStream.count());
        LongStream.range(1,50).forEach(value-> System.out.print(value+","));
        System.out.println();
        System.out.println("Range Closed Count with long"+LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value-> System.out.print(value+","));
        IntStream.rangeClosed(0,50).asDoubleStream().forEach(System.out::println);
    }
}
