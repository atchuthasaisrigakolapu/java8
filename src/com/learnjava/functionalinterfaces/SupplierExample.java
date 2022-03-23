package com.learnjava.functionalinterfaces;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {
           return  new Student("sai",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"));
        };
        System.out.println("Student is:"+studentSupplier.get());
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Students are:"+listSupplier.get());



    }
}
