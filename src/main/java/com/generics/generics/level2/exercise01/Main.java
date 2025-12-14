package com.generics.generics.level2.exercise01;

import com.generics.generics.level1.exercise02.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Arianna", "Barrientos", 13);
        GenericsMethodsFixed.printElements("STRING FIXED", person, 777);
        System.out.println();
    }
}
