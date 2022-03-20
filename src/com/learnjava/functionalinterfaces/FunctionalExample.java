package com.learnjava.functionalinterfaces;

import java.util.function.Function;

public class FunctionalExample {

    public static Function<String,String> upperCase =(name)->name.toUpperCase();
    public static Function<String,String> addSomeString =(name)->name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("Results is ::"+upperCase.apply("sai"));
        System.out.println("Results of andThen is ::"+upperCase.andThen(addSomeString).apply("sai"));
        System.out.println("Results of compose is ::"+upperCase.compose(addSomeString).apply("sai"));
    }
}
