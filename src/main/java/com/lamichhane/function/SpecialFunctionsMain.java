package com.lamichhane.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class SpecialFunctionsMain {

    public static void main(String[] args) {

        UnaryOperator<String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("java"));  // Output: JAVA

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(3, 4));  // Output: 12


    }
}
