package com.lamichhane.lambda_expression;

public class LengthOfStringMain {

    public static void main(String[] args) {
        StringLengthInterface interf = s -> s.length();
        System.out.println(interf.getLength("Hello"));
    }
}

@FunctionalInterface
interface StringLengthInterface {
    public int getLength(String s);
}
