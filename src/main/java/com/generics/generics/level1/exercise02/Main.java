package com.generics.generics.level1.exercise02;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Arianna", "Barrientos", 13);

        System.out.println("first call ");
        GenericMethods.printItems(person, "Hello", 345);

        System.out.println("Second call ");
        GenericMethods.printItems("Hi", 5.42, person);

    }
}
