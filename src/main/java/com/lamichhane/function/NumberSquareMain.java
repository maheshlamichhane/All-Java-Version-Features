package com.lamichhane.function;

import java.util.function.Function;

public class NumberSquareMain {

    public static void main(String[] args) {
        Function<Integer,Integer> function = a -> a * a;
        System.out.println(function.apply(4));
    }
}
