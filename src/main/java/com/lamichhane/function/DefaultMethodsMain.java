package com.lamichhane.function;

import java.util.function.Function;

public class DefaultMethodsMain {

    public static void main(String[] args) {

        Function<String,String> f1 = s -> s.toUpperCase();
        Function<String,String> f2 = s -> s.substring(0,9);

        Function<Integer,Integer> f3 = s -> s + s;
        Function<Integer,Integer> f4 = s -> s * s;

        System.out.println(f1.andThen(f2).apply("AishwaryaAbhi"));
        System.out.println(f1.compose(f2).apply("AishwaryaAbhi"));

        Function<String,String> f5 = Function.identity();

        System.out.println(f3.andThen(f4).apply(2));
        System.out.println(f3.compose(f4).apply(2));

        System.out.println(f5.apply("Mahesh"));
    }
}
