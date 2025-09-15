package com.lamichhane.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveSupplierMain {

    public static void main(String[] args) {

        IntSupplier randomInt = () -> (int) (Math.random() * 100);
        System.out.println("Random Int: " + randomInt.getAsInt());

        LongSupplier currentTime = () -> System.currentTimeMillis();
        System.out.println("Current Time (ms): " + currentTime.getAsLong());

        DoubleSupplier randomDouble = () -> Math.random();
        System.out.println("Random Double: " + randomDouble.getAsDouble());
    }
}
