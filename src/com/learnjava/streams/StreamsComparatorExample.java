package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name :");
        System.out.println(sortStudentsByName());
        System.out.println("Students sorted by GPA");
        System.out.println(sortStudentsByGpa());
        System.out.println("Students sorted by GPADesc");
        System.out.println(sortStudentsByGpaDesc());
    }
}
