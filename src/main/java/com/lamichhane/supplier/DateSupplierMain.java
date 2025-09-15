package com.lamichhane.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class DateSupplierMain {

    public static void main(String[] args) {

        Supplier<Date> mydatesupplier = () -> new Date();

        System.out.println(mydatesupplier.get());

    }
}
