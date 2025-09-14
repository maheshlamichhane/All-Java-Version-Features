package com.lamichhane.lambda_expression;

public class AddTwoNumberMain {

    public static void main(String[] args) {
        NumAddInterface interf = (num1,num2) -> num1 + num2;
        System.out.println(interf.add(1,2));
    }
}

@FunctionalInterface
interface NumAddInterface {
    public int add(int num1,int num2);
}
