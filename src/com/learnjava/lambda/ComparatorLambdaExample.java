package com.learnjava.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparatorObject =  new Comparator<>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of the comparator is ::"+comparatorObject.compare(10,9));

        Comparator<Integer> integerComparator = (Integer o1, Integer o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println("Result of the comparator using lambda"+integerComparator.compare(15, 20));
        Comparator<Integer> integerComparator1 = (Integer o1, Integer o2) -> o1.compareTo(o2);
        System.out.println("Result of the comparator using lambda"+integerComparator1.compare(10, 10));

    }
}
