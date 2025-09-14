package com.lamichhane.lambda_expression;

public class RunnableMain {

    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0; i<10; i++){
                System.out.println("Child thread "+i);
            }
        };

        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10;i++){
            System.out.println("Main thread "+i);
        }
    }
}
