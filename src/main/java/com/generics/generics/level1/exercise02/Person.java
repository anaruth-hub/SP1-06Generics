package com.generics.generics.level1.exercise02;

public class Person {
    private final String name;
    private final String lastname;
    private final int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;

    }

    public String getName() { return name; }
    public String getLastname() {return lastname; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', lastname ='" + lastname + "', age " + age + "}";

    }
}
