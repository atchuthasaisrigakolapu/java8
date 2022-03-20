package com.learnjava.functionalinterfaces;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
    static List<Student> students =  StudentDataBase.getAllStudents();

    public static void printStudents(){
        System.out.println("printStudents");
        students.forEach(c2);
    }
    public static void printStudentNamesAndActivities(){
        System.out.println("printStudentNamesAndActivities");
        students.forEach(c3.andThen(c4));//consumer channing
    }
    public static void printStudentNamesAndActivitiesUsingConditions(){
        System.out.println("printStudentNamesAndActivitiesUsingConditions");
        students.forEach(student->{
            if(student.getGradeLevel()>=3&&student.getGpa()>=3){
                c3.andThen(c4).accept(student);
            }
        });//consumer channing

    }

    public static void main(String[] args) {

        Consumer<String> cunsumer =  new Consumer(){

            @Override
            public void accept(Object o) {
                System.out.println(((String)o).toUpperCase());
            }

        };
        cunsumer.accept("sai");
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");
        printStudents();
        printStudentNamesAndActivities();
        printStudentNamesAndActivitiesUsingConditions();
    }
}
