package com.learnjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (a, b) -> a + b);
    }
    public static int sumOfNumbersUsingIntSteam(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> integerList =Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("sumOfNumbers::"+sumOfNumbers(integerList));
        System.out.println("sumOfNumbers using IntStream::"+sumOfNumbersUsingIntSteam());


    }
}
