package com.learnjava.defaults;

import java.util.List;

public interface Multiplier {
    public int multiplier(List<Integer> integerList);
    default int size(List<Integer> integerList){
        System.out.println("Inside multiplier interface");
        return (integerList != null)?integerList.size():0;
    }
    static boolean isEmpty(List<Integer> integerList){
        System.out.println("Inside multiplier interface");
        return (integerList != null && integerList.size()>0);
    }


}
