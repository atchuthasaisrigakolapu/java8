package com.learnjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("sai");
        names.add("sri");
        names.add("raghu");
        for(String name:names){
            System.out.println(name);
        }
        for(String name:names){
            System.out.println(name);
        }

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
       // stream.forEach(System.out::println);//donot traverse next time
    }
}
