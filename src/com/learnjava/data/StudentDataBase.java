package com.learnjava.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {
    public static Supplier<Student> studentSupplier  = ()->{
        return new Student("sai",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"));
    };
    public static List<Student> getAllStudents() {

        Student s1 = new Student("sai",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"),10);
        Student s2 = new Student("sri",2,3.8,"female", Arrays.asList("swimming","gymnasticks","soccer"),11);

        Student s3 = new Student("raghu",3,4.0,"male", Arrays.asList("swimming","gymnasticks","volleyball"),12);
        Student s4 = new Student("reshma",3,3.9,"female",Arrays.asList("swimming","gymnasticks","soccer"),14);

        Student s5 = new Student("siva",4,3.5,"male", Arrays.asList("swimming","dancing","football"),12);
        Student s6 = new Student("surya",4,3.9,"male", Arrays.asList("swimming","basketball","baseball","football"),12);
        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);
        return students;
    }


}
