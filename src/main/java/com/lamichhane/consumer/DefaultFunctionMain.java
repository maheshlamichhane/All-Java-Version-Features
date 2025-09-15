package com.lamichhane.consumer;

import java.util.function.Consumer;

public class DefaultFunctionMain {

    public static void main(String[] args) {
        Consumer<Movies> c1 = movie -> System.out.println("Movie : "+movie.name + " is ready to release");
        Consumer<Movies> c2 = movie -> System.out.println("Movie : "+movie.name + " is just release and it is "+movie.result);
        Consumer<Movies> c3 = movie -> System.out.println("Movie : "+movie.name + " information storing in database");

        Consumer<Movies> mychain = c1.andThen(c2).andThen(c3);
        Movies m1 = new Movies("Bahubali","Hit");
        mychain.accept(m1);
    }

}


class Movies {

    String name;
    String result;


    public Movies(String name, String result) {
        this.name = name;
        this.result = result;
    }



}
