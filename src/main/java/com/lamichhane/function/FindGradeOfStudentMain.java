package com.lamichhane.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FindGradeOfStudentMain {

    public static void populate(List<Student> list) {
        list.add(new Student("Mahesh",100));
        list.add(new Student("Pits",65));
        list.add(new Student("Sagar",55));
        list.add(new Student("Kamal",45));
        list.add(new Student("Nabin",25));
    }

    public static void main(String args[]) {

        List<Student> mylist = new ArrayList<>();
        populate(mylist);

        Function<Student,String> f1 = s -> {
            int marks = s.marks;
            if(marks > 80) {
                return "Distinsion";
            }
            else if(marks > 60) {
                return "First";
            }
            else if(marks > 45) {
                return "Second";
            }
            else if(marks > 35) {
                return "Third";
            }
            else {
                return "Fail";
            }
        };

        for(Student s : mylist) {
            System.out.println(s.name);
            System.out.println(s.marks);
            System.out.println(f1.apply(s) + " Division");

            System.out.println();
            System.out.println();
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
