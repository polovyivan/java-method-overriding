package com.polovyi.ivan.tutorials;

import java.io.IOException;

class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Animal Name: " + name +
                ", Age: " + age);
    }

    protected void displayDetailsProtected() {
        System.out.println("Animal Name: " + name +
                ", Age: " + age);
    }

    public void displayDetailsWithException() throws IOException {
        System.out.println("Animal Name: " + name +
                ", Age: " + age);
    }

    public void displayDetailsWithMultipleException() throws IOException, ClassNotFoundException {
        System.out.println("Animal Name: " + name +
                ", Age: " + age);
    }

    public static void displayDetailsStatic() {
        System.out.println("Static method from Animal Class");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Number getAgeAsNumber() {
        return age;
    }
}

