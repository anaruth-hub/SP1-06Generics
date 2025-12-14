package com.generics.generics.level1.exercise01;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods a = new NoGenericMethods("A", "B", "C");
        NoGenericMethods b = new NoGenericMethods("C", "A", "B");

        System.out.println(a.getItem1());
        System.out.println(a.getItem2());
        System.out.println(a.getItem3());

        System.out.println("----");

        System.out.println(b.getItem1());
        System.out.println(b.getItem2());
        System.out.println(b.getItem3());
    }
}
