package com.lamichhane.supplier;

import java.util.function.Supplier;

public class GetRandomNameMain {

    public static void main(String[] args) {
        String[] my_array = {"mahesh","sagar","akash","nabin","kamal","pits"};
        Supplier<String> mysupplier = () -> {
            int x = (int) (Math.random() * 6);
            return my_array[x];
        };
        System.out.println(mysupplier.get());
    }


}
