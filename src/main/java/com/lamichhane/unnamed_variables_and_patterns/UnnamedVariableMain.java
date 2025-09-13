package com.lamichhane.unnamed_variables_and_patterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.IntStream;

public class UnnamedVariableMain {

    public static void main(String[] args) {

        String[] data = {"April","Brendan"};
        for(String name : data){
            System.out.println("Performing a side-effect");
        }

        for(String _ : data){
            System.out.println("Performing a side-effect");
        }

        List<String> names = List.of("April","Brendan");
        names.forEach(name -> System.out.println("Side effect..."));
        names.forEach(_ -> System.out.println("Side effect..."));
        IntStream.range(0,5).forEach(_ -> System.out.println("Repeating action!"));

        try(BufferedReader _ = new BufferedReader(new FileReader("example.txt"))){
            System.out.println("File opened successfully");
        }
        catch (Exception e){
            System.out.println("Error reading file");
        }

        switch(new String("sjlfkdsj")){
            case String _ -> System.out.println("its a string");
            case null,default -> System.out.println("Something else");
        }


    }
}
