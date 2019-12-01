package com.practice.annotations;

public @interface MyAnnotaion {

    String name() default "DefaultAnnotationValue";
}