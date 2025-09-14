package com.lamichhane.predicate;

import java.util.function.BiPredicate;

public class BiPredicateMain {

    public static void main(String[] args) {
        BiPredicate<String, String> startsWith = (s1, s2) -> s1.startsWith(s2);
        BiPredicate<String, String> endsWith = (s1, s2) -> s1.endsWith(s2);

        BiPredicate<String, String> both = startsWith.and(endsWith);

        System.out.println(both.test("Apple", "A")); // false
        System.out.println(both.test("AnnA", "A"));  // true

    }
}
