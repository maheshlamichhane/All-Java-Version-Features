package com.lamichhane.text_blocks;

public class TextBlocksMain {

    public static void main(String[] args) {

        // text block is a string object
        String sName = "Sean Kennedy";
        String tbName = """
                Sean Kennedy""";
        System.out.println(sName.equals(tbName));
        System.out.println(sName == tbName);

        // string methods can be applied to text blocks
        System.out.println(tbName.substring(5));

        // Text block start with """ followd by a line terminator
//        String tb1 ==""" abc """; compile time error
//        String tb2 = """abc
//                """; //compile time error
        String tb3 = """
                abc""";
        String tb4 = """
                abc
                """;
        System.out.println(tb3);
        System.out.println(tb4);

        // Embedded double quotes are not required in text blocks
        String sQuote = "Hamlet: \"There is nothing bad\" ";
        System.out.println(sQuote);
        String tbQuote = """
                Hamlet: "Threre is nothing bad"
                """;
        System.out.println(tbQuote);

        // Depending on where you place closing delimiter determines whether or not you have a closing
        String sBookTitle1 = "Java\nMemory\nManagement\n";
        String tbBookTitle1 = """
                Java
                Memory
                Management
                """;
        System.out.println(sBookTitle1);
        System.out.println(123);
        System.out.println(tbBookTitle1);
        System.out.println(123);


        //json
        String text = """
                {
                    "name":"Jane Doe",
                    "age":"23,
                    "address":"Main Street, Dublin"
                }""";
        System.out.println(text);
    }
}
