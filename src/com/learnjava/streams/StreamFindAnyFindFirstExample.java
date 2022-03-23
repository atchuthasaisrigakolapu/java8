package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFindFirstExample {
    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3.0)
                .findFirst();
    }
    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3.0)
                .findAny();
    }

    public static void main(String[] args) {
        Optional<Student> first = findFirst();
        if(first.isPresent())
            System.out.println("Found the student :"+first.get());
        else
            System.out.println("student not found");
        Optional<Student> firstAny = findAny();
        if(firstAny.isPresent())
            System.out.println("Found the student :"+firstAny.get());
        else
            System.out.println("student not found");
    }

}
