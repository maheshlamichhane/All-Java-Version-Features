package com.lamichhane.lambda_expression;

public class HelloWorldLambdaMain {

    public static void main(String[] args) {
        Interf r = () -> System.out.println("Hello World");
        r.m1();
    }
}


@FunctionalInterface
interface Interf {

    public void m1();
}
