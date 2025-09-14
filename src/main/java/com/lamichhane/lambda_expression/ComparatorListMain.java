package com.lamichhane.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(20);


        System.out.println("Before Sorting With Lambda");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Ascending Order Sorting With Lambda");
        System.out.println(list);
        System.out.println("Descending Order Sorting With Lambda");
        Collections.sort(list,(I1,I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0 );
        System.out.println(list);
    }
}
