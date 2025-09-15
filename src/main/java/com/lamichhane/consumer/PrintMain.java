package com.lamichhane.consumer;

import java.util.function.Consumer;

public class PrintMain {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("hello");

    }
}
