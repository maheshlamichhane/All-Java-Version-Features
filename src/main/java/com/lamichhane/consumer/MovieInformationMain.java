package com.lamichhane.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieInformationMain {

    public static void populate(List<Movie> list) {
        list.add(new Movie("Bahubali","Prabhas","Anushka"));
        list.add(new Movie("My Name Is Khan","Shahrukh","Kajol"));
        list.add(new Movie("Ek Tha Tiger","Salman","Katrina"));
    }

    public static void main(String[] args) {

        List<Movie> allMovie = new ArrayList<Movie>();
        populate(allMovie);

        Consumer<Movie> mycon = movie -> {
            System.out.println("Name : "+movie.name);
            System.out.println("Hero : "+movie.hero);
            System.out.println("Heroine : "+movie.heroine);
            System.out.println();
        };

        for(Movie m : allMovie) {
            mycon.accept(m);
        }



    }

}

class Movie {

    String name;
    String hero;
    String heroine;


    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }




}
