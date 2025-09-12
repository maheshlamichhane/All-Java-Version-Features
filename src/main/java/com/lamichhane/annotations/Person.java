package com.lamichhane.annotations;

public class Person implements Moveable{
    private String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Moving");
    }
}
