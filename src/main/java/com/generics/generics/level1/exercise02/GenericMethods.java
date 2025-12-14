package com.generics.generics.level1.exercise02;

public class GenericMethods {

    public static <T,U, V> void  printItems(T a, U b, V c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
