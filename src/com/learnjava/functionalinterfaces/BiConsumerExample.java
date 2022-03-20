package com.learnjava.functionalinterfaces;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activies) -> System.out.println("name:" + name + " " + "activities:" + activies);
        List<Student> studentsList =  StudentDataBase.getAllStudents();
        studentsList.forEach(student->{
            biConsumer.accept(student.getName(),student.getActivities());
        });
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println("a=" + s1 + "" + "b=" + s2);
        biConsumer.accept("sai","sri");

        BiConsumer<Integer, Integer> multiply = (i1, i2) -> System.out.println("Multiply is :"+i1*i2);
        BiConsumer<Integer, Integer> division = (i1, i2) -> System.out.println("Division is :"+i1/i2);
        multiply.andThen(division).accept(20,10);//Biconsumer channing
        nameAndActivities();


    }
}
