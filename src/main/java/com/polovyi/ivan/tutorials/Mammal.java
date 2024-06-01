package com.polovyi.ivan.tutorials;

import java.io.IOException;
import java.nio.file.FileSystemException;

class Mammal extends Animal {

    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public void displayDetails() {
        System.out.println("Mammal Name: " + getName() + ", "
                + "Age: " + getAge() +
                ", Has Fur: " + hasFur);
    }

    @Override
    public void displayDetailsProtected() {
        System.out.println("Mammal Name: " + getName() + ", "
                + "Age: " + getAge() +
                ", Has Fur: " + hasFur);
    }

// Won't compile
//    @Override
//    void displayDetailsProtected() {
//        System.out.println("Mammal Name: " + getName() + ", "
//                + "Age: " + getAge() +
//                ", Has Fur: " + hasFur);
//    }

    //  Won't compile
//    @Override
//    private void displayDetailsProtected() {
//        System.out.println("Mammal Name: " + getName() + ", "
//                + "Age: " + getAge() +
//                ", Has Fur: " + hasFur);
//    }

    @Override
    public Integer getAgeAsNumber() {
        return super.getAgeAsNumber().intValue();
    }

    @Override
    public void displayDetailsWithException() throws FileSystemException, IOException {
        System.out.println("Animal Name: " + getName() +
                ", Age: " + getAge());
    }

    @Override
    public void displayDetailsWithMultipleException() throws
            ClassNotFoundException,
            RuntimeException {
        System.out.println("Animal Name: " + getName() +
                ", Age: " + getAge());
    }

//  Won't compile
//    @Override
//    public void displayDetailsWithException() throws Exception {
//        System.out.println("Animal Name: " + getName() +
//                ", Age: " + getAge());
//    }

//  Won't compile
//    @Override
//    public void displayDetailsWithException() throws FileSystemException, Exception {
//        System.out.println("Animal Name: " + getName() +
//                ", Age: " + getAge());
//    }

    public static void displayDetailsStatic() {
        System.out.println("Static method from Mammal Class");
    }

    public boolean hasFur() {
        return hasFur;
    }
}
