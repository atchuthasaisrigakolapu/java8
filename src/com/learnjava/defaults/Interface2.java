package com.learnjava.defaults;

public interface Interface2 extends Interface1{

    default void methodB(){
        System.out.println("Inside MethodB");
    }
    default void methodA(){
        System.out.println("Inside methodA"+Interface2.class);
    }

}
