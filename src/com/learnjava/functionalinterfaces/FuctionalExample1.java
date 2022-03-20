package com.learnjava.functionalinterfaces;

public class FuctionalExample1 {

    public static String performConcat(){
        return FunctionalExample.addSomeString.apply("sai");
    }

    public static void main(String[] args) {
       String result =  performConcat();
        System.out.println("Result :"+result);
    }
}
