package com.lamichhane.predicate;

import java.util.function.Predicate;

public class GreaterThanTenMain {

    public static void main(String[] args) {
        Predicate<Integer> num = I -> I > 10;
        System.out.println(num.test(100));
        System.out.println(num.test(5));
    }
}
