package com.learnjava.methodreference;

import java.util.function.Function;

public class FunctionalMethodReference {

    static Function<String, String> toUpperacseLambda = (name) -> name.toUpperCase();
    static Function<String, String> toUpperacseWithMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperacseLambda.apply("sai"));
        System.out.println(toUpperacseWithMethodReference.apply("sai"));
    }
}
