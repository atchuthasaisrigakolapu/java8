package com.learnjava.functionalinterfaces;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGpa() > 3.0;
    static Predicate<Student> p2 = (student) -> student.getGradeLevel() > 3;

    static void filterStudentByGpa(){
        List<Student> students =  StudentDataBase.getAllStudents();
        System.out.println("filterStudentByGpa:");
        students.forEach(student -> {
                    if (p1.test(student)){
                        System.out.println(student);
                    }
                }
        );
    }
    static void filterStudentByGradeLevel(){
        List<Student> students =  StudentDataBase.getAllStudents();
        System.out.println("filterStudentByGradeLevel:");
        students.forEach(student -> {
                    if (p2.test(student)){
                        System.out.println(student);
                    }
                }
        );
    }
    static void filterStudents(){
        List<Student> students =  StudentDataBase.getAllStudents();
        System.out.println("filterStudents:");
        students.forEach(student -> {
                    if (p1.and(p2).negate().test(student)){
                        System.out.println(student);
                    }
                }
        );
    }

    public static void main(String[] args) {

        filterStudentByGpa();
        filterStudentByGradeLevel();
        filterStudents();
    }
}
