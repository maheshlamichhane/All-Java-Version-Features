package com.lamichhane.annotations;


import java.lang.annotation.*;

@Target(ElementType.TYPE)                // Apply to classes, interfaces, enums
@Retention(RetentionPolicy.RUNTIME)     // Keep at runtime for reflection
@interface ClassInfo {
    String author() default "Unknown";
    String purpose() default "No purpose specified";
}

@ClassInfo(author = "Suman Lamichhane", purpose = "Demo of class-level annotation")
public class ClassAnnotationMain {

    public static void main(String[] args) {
        Class<ClassAnnotationMain> clazz = ClassAnnotationMain.class;


        if (clazz.isAnnotationPresent(ClassInfo.class)) {
            ClassInfo classInfo = clazz.getAnnotation(ClassInfo.class);
            System.out.println("Class Annotation Info:");
            System.out.println("Author: " + classInfo.author());
            System.out.println("Purpose: " + classInfo.purpose());
            System.out.println();
        }

    }
}
