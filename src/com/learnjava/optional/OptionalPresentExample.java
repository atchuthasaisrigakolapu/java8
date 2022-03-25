package com.learnjava.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> hi_sai = Optional.ofNullable("Hi sai");
        System.out.println(hi_sai.isPresent());
        if(hi_sai.isPresent())
            System.out.println(hi_sai.get());
        hi_sai.ifPresent(s-> System.out.println(s));
    }
}
