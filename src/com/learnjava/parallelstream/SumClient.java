package com.learnjava.parallelstream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(0,1000)
                .forEach(sum::performSum);
        System.out.println(sum.getSum());
        Sum sum2 = new Sum();
        IntStream.rangeClosed(0,1000)
                .parallel()
                .forEach(sum2::performSum);
        System.out.println(sum2.getSum());
    }
}
