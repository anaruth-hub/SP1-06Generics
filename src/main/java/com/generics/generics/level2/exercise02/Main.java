package com.generics.generics.level2.exercise02;

import com.generics.generics.level1.exercise02.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Arianna", "Barrientos", 28);

        GenericVarargsFixedString.printAll("HEAD FIXED", person, "another string", 42, 9.81);

    }
}