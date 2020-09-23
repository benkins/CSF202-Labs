package com.company;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
