package com.learnjava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("sai", "sri", "raghu");

       // Collections.sort(strings);
        strings.sort(Comparator.naturalOrder());
       // strings.sort(Comparator.reverseOrder());

        System.out.println("Collections.sort"+strings);

    }
}
