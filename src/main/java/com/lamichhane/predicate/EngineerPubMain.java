package com.lamichhane.predicate;

import java.util.function.Predicate;

public class EngineerPubMain {

    public static void main(String[] args) {
        SoftwareEngineer[] mylist = {
                new SoftwareEngineer("Nabin",27,true),
                new SoftwareEngineer("Mahesh",28,false),
                new SoftwareEngineer("Kamal",23,true),
                new SoftwareEngineer("Pits",25,false),
        };


        Predicate<SoftwareEngineer> my_predicate = s -> s.isHavingGf;

        for(SoftwareEngineer s : mylist) {
            if(my_predicate.test(s)) {
                System.out.println(s);
            }
        }

    }
}

class SoftwareEngineer {

    String name;
    int age;
    boolean isHavingGf;


    public SoftwareEngineer() {
    }


    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }


    @Override
    public String toString() {
        return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGf=" + isHavingGf + "]";
    }
}
