package com.learnjava.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static int i=10;
    public static void main(String[] args) {

       // int i=5;
        Consumer<Integer> c1 = (value) -> {
            i++;
            System.out.println(i);
        };
        c1.accept(5);

    }
}
