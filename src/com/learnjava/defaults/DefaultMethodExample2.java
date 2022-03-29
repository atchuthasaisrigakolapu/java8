package com.learnjava.defaults;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
    static Consumer<Student> consumerStudent = (student) -> System.out.println(student);
    static Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> studentGpa = Comparator.comparingDouble(Student::getGpa);
    //static Comparator<Student> studentNameAndGpa = Comparator.comparingDouble(Student::getGpa);
    public static void  sortByName(List<Student> studentList){
        studentList.sort(studentComparator);
        System.out.println("After sort");
        studentList.forEach(consumerStudent);
    }
    public static void  sortByGpa(List<Student> studentList){
        studentList.sort(studentGpa);
        System.out.println("After sort");
        studentList.forEach(consumerStudent);
    }
    public static void comparatorChaning(List<Student> studentList){
        studentList.sort(studentComparator.thenComparing(studentGpa));
        System.out.println("After sort");
        studentList.forEach(consumerStudent);
    }
    public static void compareNullsFirst(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.nullsFirst(DefaultMethodExample2.studentComparator);
        studentList.sort(studentComparator);
        System.out.println("After sort");
        studentList.forEach(consumerStudent);
    }


    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println("Before sort");
        allStudents.forEach(consumerStudent);
       // sortByName(allStudents);
       // sortByGpa(allStudents);
       // System.out.print(allStudents);
       // comparatorChaning(allStudents);
        compareNullsFirst(allStudents);
    }
}
