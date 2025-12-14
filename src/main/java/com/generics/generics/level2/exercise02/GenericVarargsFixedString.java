package com.generics.generics.level2.exercise02;

public class GenericVarargsFixedString {

    @SafeVarargs
    public static <T> void printAll(String fixed, T... items) {
        System.out.println(fixed);
        for (T item : items) {
            System.out.println(item);
        }
    }
}
