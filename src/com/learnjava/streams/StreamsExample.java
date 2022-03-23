package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        Predicate<Student> studentGpa = student ->student.getGpa()>=3.9;
        Predicate<Student> studentGradeLevel = student ->student.getGradeLevel()>=3.0;
        Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println("before first filter"+student))
                .filter(studentGpa)
                .peek(student -> System.out.println(" before second filter"+student))
                .filter(studentGradeLevel)
                .peek(student -> System.out.println(" before collect "+student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(stringListMap);
    }
}
