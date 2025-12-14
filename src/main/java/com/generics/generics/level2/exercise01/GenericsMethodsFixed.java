package com.generics.generics.level2.exercise01;

public class GenericsMethodsFixed {

    public static <T, U> void  printElements(String fixed, T a, U b) {
        System.out.println(fixed);
        System.out.println(a);
        System.out.println(b);
    }
}
