package com.lamichhane.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionMain {

    public static void populate(List<Student> list) {
        list.add(new Student("Mahesh",90));
        list.add(new Student("Pits",70));
        list.add(new Student("Kamal",50));
        list.add(new Student("Sagar",40));
        list.add(new Student("Arjun",30));
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        populate(list);

        Predicate<Integer> mypredicate= marks -> marks > 60;
        Function<Student,String> myfunction = student -> {
            int marks = student.marks;
            if(marks > 80) {
                return "Distinsion";
            }
            else if(marks > 60) {
                return "First Division";
            }
            else if(marks > 50) {
                return "Second Division";
            }
            else if(marks > 35) {
                return "Third Division";
            }
            else {
                return "Fail";
            }
        };
        Consumer<Student> myconsumer = student -> {
            System.out.println("Name : "+student.name);
            System.out.println("Marks : "+student.marks);
            System.out.println("Grade : "+myfunction.apply(student));
            System.out.println();
        };

        for(Student s : list) {
            if(mypredicate.test(s.marks)) {
                myconsumer.accept(s);
            }
        }
    }

}

class Student {
    String name;
    int marks;


    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }



}
