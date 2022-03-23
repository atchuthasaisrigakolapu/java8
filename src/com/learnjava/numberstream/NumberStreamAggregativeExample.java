package com.learnjava.numberstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumberStreamAggregativeExample {

    public static void main(String[] args) {
        int sum = IntStream.range(0, 50).sum();
        System.out.println("Sum is ="+sum);
        OptionalInt max = IntStream.rangeClosed(0, 50).max();
        System.out.println(max.isPresent() ? max.getAsInt() : 0);
        System.out.println("Count:"+IntStream.rangeClosed(0,50).count());
        OptionalLong min = LongStream.rangeClosed(0, 50).min();
        System.out.println(min.isPresent() ? min.getAsLong() : 0);
        OptionalDouble doubleOptional = IntStream.rangeClosed(0, 50).average();
        System.out.println(doubleOptional.isPresent()?doubleOptional.getAsDouble():0);

    }
}
