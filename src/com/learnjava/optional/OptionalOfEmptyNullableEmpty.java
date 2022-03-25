package com.learnjava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableEmpty {
    public static Optional<String> ofNullable(){
        return Optional.ofNullable("sai");
    }
    public static Optional<String> ofNullableCase2(){
        Optional<String> sai;
        sai = Optional.ofNullable(null);
        return sai;
    }
    public static Optional<String> of(){
        Optional<String> sai;
        sai = Optional.of("sai");
        return sai;
    }
    public static Optional<String> ofCase2(){
        Optional<String> sai;
      //  sai = Optional.of(null);//null
        return null;
    }
    public static Optional<String> empty(){
        Optional<String> sai;
        sai = Optional.empty();
        return sai;
    }



    public static void main(String[] args) {
        System.out.println("OffNullable"+ofNullable());
        System.out.println("OffNullable2"+ofNullableCase2());
        System.out.println("Of"+of());
        System.out.println("OfCase2"+ofCase2());
        System.out.println("empty"+empty());

    }
}
