package com.learnjava.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int multiplier(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public int size(List<Integer> integerList) {
        System.out.println("Inside multiplierImpl interface");
        return (integerList != null)?integerList.size():0;
    }
    public static boolean isEmpty(List<Integer> integerList){
        System.out.println("Inside multiplierImpl interface");
        return (integerList != null && integerList.size()>0);
    }
}
