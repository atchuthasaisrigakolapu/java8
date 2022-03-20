package com.learnjava.functionalinterfaces;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (student) -> student.getGpa() > 3.0;
    Predicate<Student> p2 = (student) -> student.getGradeLevel() > 3;
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel > 3 && gpa > 3.0;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name+":"+activities);
    Consumer<Student> studentConsumer = student->{
       // if(p1.and(p2).test(student)){
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };
    public void printNameAndActivies(List<Student> getAllStudents){
        getAllStudents.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> getAllStudents  = StudentDataBase.getAllStudents();
       new  PredicateAndConsumerExample().printNameAndActivies(getAllStudents);
    }
}
