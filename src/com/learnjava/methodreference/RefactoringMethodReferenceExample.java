package com.learnjava.methodreference;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactoringMethodReferenceExample {

    //    static Predicate<Student> p1 =(student)->{
//        return student.getGradeLevel()>=3;
//    };
    static Predicate<Student> p1 =  RefactoringMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
