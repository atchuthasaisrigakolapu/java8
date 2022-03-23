package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static int performMultiplycationWithIdentity(List<Integer> list) {
        return list.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplycationWithoutIdentity(List<Integer> list) {
        return list.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> performHighestGpaStudent() {
//        return StudentDataBase.getAllStudents().stream()
//                .reduce((s1,s2)->{
//                    if(s1.getGpa()>s2.getGpa())
//                        return s1;
//                    else
//                        return s2;
//                });

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }


    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println(performMultiplycationWithIdentity(listInteger));
        Optional<Integer> optionalInteger = performMultiplycationWithoutIdentity(listInteger);
        System.out.println(optionalInteger.isPresent());
        System.out.println(optionalInteger.get());
        Optional<Integer> optionalWithOutInteger = performMultiplycationWithoutIdentity(new ArrayList<>());
        System.out.println(optionalWithOutInteger.isPresent());
        if (optionalWithOutInteger.isPresent())
            System.out.println(optionalWithOutInteger.get());
        else
            System.out.println("Value not present");
        if (performHighestGpaStudent().isPresent())
            System.out.println("performHighestGpaStudent" + performHighestGpaStudent().get());

    }
}
