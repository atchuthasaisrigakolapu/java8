package com.learnjava.streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapExample {

    public static List<String> printStudentActivies(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public static List<String> printStudentActivies2(){
        Stream<Student> stream = StudentDataBase.getAllStudents().stream();
        Function<Student, List<String>>  functionObj = (student) -> student.getActivities();
      //  Stream<List<String>> listStream = stream.map(student -> student.getActivities());
        Stream<List<String>> listStream = stream.map(functionObj);
        Function<List<String>,Stream<String>> flatMap = (listStream2)->listStream2.stream();
      // Stream<String> stringStream = listStream.flatMap(activities -> activities.stream());
        Stream<String> stringStream = listStream.flatMap(flatMap);
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println("collect"+collect);
      return collect;
    }
    public static long getPrintStudentActiviesCount(){
        long count;
         count = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivies());
        System.out.println(getPrintStudentActiviesCount());
        System.out.println(printStudentActivies2());

    }
}
