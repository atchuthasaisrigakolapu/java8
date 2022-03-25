package com.learnjava.streamsterminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMappingExample {

    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println("nameList"+nameList);
        Set<String> nameSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
        System.out.println("nameSet"+nameList);
        List<String> nameListOldProcess = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("nameListOldProcess"+nameListOldProcess);

    }
}
