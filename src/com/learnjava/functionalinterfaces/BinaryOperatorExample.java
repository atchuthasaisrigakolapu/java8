package com.learnjava.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(5, 8));

        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.maxBy(comparator);
        System.out.println("Results of maxBy is:" + binaryOperator1.apply(5, 8));

        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.minBy(comparator);
        System.out.println("Results of minBy is:" + binaryOperator2.apply(5, 8));


    }
}
