package com.learnjava.streamsterminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitionByExample {

    public static Map<Boolean, List<Student>> partitionByMap_1(){
        Predicate<Student> predicateStudent = (student) -> student.getGpa() > 3.5;
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(predicateStudent));
    }
    public static Map<Boolean, Set<Student>> partitionByMap_2(){
        Predicate<Student> predicateStudent = (student) -> student.getGpa() > 3.5;
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(predicateStudent,Collectors.toSet()));
    }

    public static void main(String[] args) {
        System.out.println("partitionByMap_1()"+partitionByMap_1());
        System.out.println("partitionByMap_2()"+partitionByMap_2());
    }
}
