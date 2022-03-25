package com.learnjava.optional;

import com.learnjava.data.Bike;
import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void OptionalFilter(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        student.filter(student1 -> student1.getGpa()>3.5)
                .ifPresent(System.out::println);
    }
    public static void mapExample(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> s = student.filter(student1 -> student1.getGpa() > 3.5)
                .map(Student::getName);
        System.out.println(s.get());
    }
    public static void flatExample(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> optionalString = student.filter(student1 -> student1.getGpa() > 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        System.out.println(optionalString.get());

    }
//    public static void flatExample2(){
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//        Optional<String> optionalString = student.filter(student1 -> student1.getGpa() > 3.5)
//                .flatMap(student2->student2.getListBike().stream())
//               // .map(Bike::getName);
//        System.out.println(optionalString.get());
//
//    }

    public static void main(String[] args) {
        OptionalFilter();
        mapExample();
        flatExample();
    }
}
