package com.lamichhane.predicate;

import java.util.function.Predicate;

public class LengthOfStringMain {
    public static void main(String[] args) {
        Predicate<String> value = s -> s.length() > 5;
        System.out.println(value.test("abcdef"));
        System.out.println(value.test("hehe"));
    }
}
