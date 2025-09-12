package com.lamichhane.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)               // Annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME)      // Available at runtime for reflection
@interface MethodInfo {
    String description() default "No description";
    boolean isEnabled() default true;
}


public class MethodAnnotationMain {

    @MethodInfo(description = "Prints the value of the name field", isEnabled = true)
    public static void printName() {
        System.out.println(">> Inside printName(): ");
    }


    public static void main(String[] args) {
        Class<MethodAnnotationMain> clazz = MethodAnnotationMain.class;

        System.out.println("Method Annotation Info:");
        for (var method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Description: " + methodInfo.description());
                System.out.println("Enabled: " + methodInfo.isEnabled());

                // Call method if enabled
                if (methodInfo.isEnabled()) {
                    try {
                        method.invoke(null); // null because it's a static method
                    } catch (Exception e) {
                        System.out.println("Error invoking method: " + e.getMessage());
                    }
                }
                System.out.println();
            }
        }
    }
}
