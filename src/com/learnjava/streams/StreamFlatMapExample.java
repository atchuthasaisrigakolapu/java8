package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivies(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public static long getPrintStudentActiviesCount(){
        long count;
         count = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivies());
        System.out.println(getPrintStudentActiviesCount());
    }
}
