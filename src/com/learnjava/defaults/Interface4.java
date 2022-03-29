package com.learnjava.defaults;

public interface Interface4 {

    default void methodA(){
        System.out.println("Inside methodA"+Interface1.class);
    }
    static void staticMethodA(){
        System.out.println("Inside static methodA"+Interface4.class);
    }
}
