package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .filter(student -> student.getGpa()>=3.0)
                .collect(Collectors.toList());

    }


    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
