package com.lamichhane.consumer;

import java.util.function.BiConsumer;

public class BiConsumerMain {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> myconsumer = (a, b) -> System.out.println(a+b);
        myconsumer.accept(3, 4);
    }
}
