package com.learnjava.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier= new MultiplierImpl();
        List<Integer> inputList = Arrays.asList(1,2,3,4,5);
        System.out.println(multiplier.multiplier(inputList));
        System.out.println("Size:"+multiplier.size(inputList));
        System.out.println("Empty or not:"+MultiplierImpl.isEmpty(inputList));

    }
}
