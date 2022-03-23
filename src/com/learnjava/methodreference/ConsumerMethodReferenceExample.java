package com.learnjava.methodreference;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

//    static Consumer<Student> c1 = (student)->System.out.println(student);
    static Consumer<Student> c1 = System.out::println;
    //static Consumer<Student> c2 = (student)->student.printActivies();
    static Consumer<Student> c2 = Student::printActivies;
    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c1);
        allStudents.forEach(c2);
    }
}
