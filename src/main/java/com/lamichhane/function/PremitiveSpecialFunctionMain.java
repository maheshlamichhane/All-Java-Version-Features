package com.lamichhane.function;

import java.util.function.*;

public class PremitiveSpecialFunctionMain {

    public static void main(String[] args) {

        IntFunction<String> intToStr = i -> "Value: " + i;
        System.out.println(intToStr.apply(100));  // Output: Value: 100

        LongFunction<String> format = l -> "Long: " + l;
        System.out.println(format.apply(123456789L));

        DoubleFunction<String> formatDouble = d -> "Double: " + d;
        System.out.println(formatDouble.apply(3.14));  // Output: Double: 3.14

        ToIntFunction<String> strLength = s -> s.length();
        System.out.println(strLength.applyAsInt("hello"));  // Output: 5

        ToLongFunction<String> parseToLong = s -> Long.parseLong(s);
        System.out.println(parseToLong.applyAsLong("123456"));  // Output: 123456

        ToDoubleFunction<String> parseDouble = s -> Double.parseDouble(s);
        System.out.println(parseDouble.applyAsDouble("3.14"));  // Output: 3.14


        IntToLongFunction converter = i -> (long) i * 1000;
        System.out.println(converter.applyAsLong(5));  // Output: 5000

        IntToDoubleFunction toDouble = i -> i / 2.0;
        System.out.println(toDouble.applyAsDouble(5));  // Output: 2.5





    }
}
