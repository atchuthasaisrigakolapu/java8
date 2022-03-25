package com.learnjava.optional;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {
    public static String orElse(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String sai = student.map(Student::getName).orElse("Default");
        return sai;
    }
    public static String orElseGet(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String sai = student.map(Student::getName).orElseGet(()->"Default");
        return sai;
    }
    public static String orElseThrow(){
       // Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String sai = student.map(Student::getName).orElseThrow(() -> new RuntimeException("No data found"));
        return sai;
    }

    public static void main(String[] args) {
        System.out.println("orElse"+orElse());
        System.out.println("orElseGet"+orElseGet());
        System.out.println("orElseThrow"+orElseThrow());
    }
}
