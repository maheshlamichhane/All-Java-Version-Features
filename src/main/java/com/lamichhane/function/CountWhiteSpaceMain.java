package com.lamichhane.function;

import java.util.function.Function;

public class CountWhiteSpaceMain {

    public static void main(String[] args) {
        String name = "My name is mahesh";
        Function<String,Integer> function = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(function.apply(name));
    }
}
