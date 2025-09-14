package com.lamichhane.lambda_expression;

public class SquareOfNumberMain {
    public static void main(String[] args) {
        NumSquareInterface interf = num -> num * num;
        System.out.println(interf.getSquare(3));
    }
}

@FunctionalInterface
interface NumSquareInterface {
    public int getSquare(int num);
}
