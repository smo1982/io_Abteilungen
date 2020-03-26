package com.company;

public class Person {
    String Name;

    public Person(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
