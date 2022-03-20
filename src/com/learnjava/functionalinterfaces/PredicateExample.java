package com.learnjava.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i)->{return i%2==0;};
    static Predicate<Integer> p1 = i-> i%2==0;
    static Predicate<Integer> p2 = i-> i%3==0;
    public static void predicateAnd(){
        System.out.println("Predicate and results is:"+p1.and(p2).test(10));
        System.out.println("Predicate and results is:"+p1.and(p2).test(20));
    }
    public static void predicateOr(){
        System.out.println("Predicate or results is:"+p1.or(p2).test(10));
        System.out.println("Predicate or results is:"+p1.or(p2).test(9));
    }
    public static void predicateNegate(){
        System.out.println("Predicate negate results is:"+p1.or(p2).negate().test(10));
        System.out.println("Predicate negate results is:"+p1.or(p2).negate().test(7));
    }

    public static void main(String[] args) {
        System.out.println(p.test(10));
        System.out.println(p1.test(20));
        System.out.println(p2.test(20));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
