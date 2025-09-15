package com.lamichhane.supplier;

import java.util.function.Supplier;

public class StrongPasswordMain {

    public static void main(String[] args) {

        Supplier<String> my_supplier = () -> {
            String OTP = "";
            String myString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Integer> digit = () -> (int)(Math.random() * 10);
            Supplier<Character> character = () -> myString.charAt((int)(Math.random() * 29));

            for(int i = 0; i < 8; i++) {
                if(i%2 == 0) {
                    OTP += digit.get();
                }
                else {
                    OTP += character.get();
                }
            }
            return OTP;

        };

        System.out.println(my_supplier.get());

    }
}
