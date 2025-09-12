package com.lamichhane.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldInfo {
    String description() default "No description";
    boolean required() default false;
}



public class FieldAnnotationMain {

    @FieldInfo(description = "hello description", required = true)
    private static String name;

    public FieldAnnotationMain(String namee){
        name = namee;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Class<FieldAnnotationMain> clazz = FieldAnnotationMain.class;

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(FieldInfo.class)) {
                FieldInfo info = field.getAnnotation(FieldInfo.class);

                // Allow access to private static field
                field.setAccessible(true);

                // If required and value is null, set default
                if (info.required() && field.getType() == String.class) {
                    Object currentValue = field.get(null);
                    if (currentValue == null) {
                        field.set(null, "Default Name");
                    }
                }

                // Now get the actual value and description
                Object value = field.get(null);
                System.out.println("Field: " + field.getName());
                System.out.println("Value: " + value);
                System.out.println("Description: " + info.description());
            }
        }
    }
}
