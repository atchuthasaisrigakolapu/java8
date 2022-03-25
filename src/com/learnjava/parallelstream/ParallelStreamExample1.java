package com.learnjava.parallelstream;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {
    public static List<String> printStudentActivies(){
        long start = System.currentTimeMillis();
        List<String> studentActivity =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Durtion to execute the pipeline in sequall"+(end-start));
        return studentActivity;
    }
    public static List<String> printStudentActivies2(){
        long start = System.currentTimeMillis();
        List<String> studentActivity = StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Durtion to execute the pipeline in parallel"+(end-start));
        return studentActivity;
    }
    public static void main(String[] args) {
        printStudentActivies();
        printStudentActivies2();
    }
}
