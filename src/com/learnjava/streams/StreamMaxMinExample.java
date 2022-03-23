package com.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxMinExample {

    public static int findMaxValue(List<Integer> listInteger) {
        return listInteger.stream()
                //.reduce(0, (a, b) -> (a > b) ? a : b);
                .reduce(0, Integer::max);
    }

    public static Optional<Integer> findMaxValueUsingOptional(List<Integer> listInteger) {
        return listInteger.stream()
                // .reduce((a, b) -> (a > b) ? a : b);
                .reduce(Integer::max);
    }

    public static int findMinValue(List<Integer> listInteger) {
        return listInteger.stream()
                //.reduce(0, (a, b) -> (a < b) ? a : b);
                .reduce(0, Integer::min);
    }

    public static Optional<Integer> findMinValueUsingOptional(List<Integer> listInteger) {
        return listInteger.stream()
                // .reduce((a, b) -> (a < b) ? a : b);
                .reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println("Max value :" + findMaxValue(integerList));
        Optional<Integer> maxValueUsingOptional = findMaxValueUsingOptional(new ArrayList<>());
        // maxValueUsingOptional.ifPresent(integer -> System.out.println("max value using optional" + integer));
        if (maxValueUsingOptional.isPresent())
            System.out.println("Max value using optional" + maxValueUsingOptional.get());
        else
            System.out.println("max value results empty using optional");

        System.out.println("Min value :" + findMaxValue(integerList));
        Optional<Integer> minValueUsingOptional = findMaxValueUsingOptional(new ArrayList<>());
        // maxValueUsingOptional.ifPresent(integer -> System.out.println("max value using optional" + integer));
        if (minValueUsingOptional.isPresent())
            System.out.println("Min value using optional" + minValueUsingOptional.get());
        else
            System.out.println("min value results empty using optional");
    }
}


