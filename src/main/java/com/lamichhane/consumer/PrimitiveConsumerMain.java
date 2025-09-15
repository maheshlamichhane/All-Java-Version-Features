package com.lamichhane.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumerMain {

    public static void main(String[] args) {

        IntConsumer square = x -> System.out.println("Square: " + (x * x));
        square.accept(5);

        LongConsumer printMB = bytes -> System.out.println("Size in MB: " + (bytes / (1024 * 1024)) + " MB");
        printMB.accept(10485760L);

        DoubleConsumer addTax = price -> {
            double finalPrice = price + (price * 0.18);  // 18% tax
            System.out.println("Price with Tax: " + finalPrice);
        };

        addTax.accept(100.0);
    }
}
