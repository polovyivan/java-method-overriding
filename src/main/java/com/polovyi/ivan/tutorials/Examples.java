package com.polovyi.ivan.tutorials;

public class Examples {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1);
        animal.displayDetails();

        Mammal mammal = new Mammal("Mammal", 2, true);
        mammal.displayDetails();
        Animal animalMammal  = new Mammal("AnimalMammal", 2, true);
        animalMammal.displayDetails();

        Number animalAge = animal.getAgeAsNumber();
        System.out.println("animalAge = " + animalAge);

        Integer mammalAgeAsNumber = mammal.getAgeAsNumber();
        System.out.println("mammalAgeAsNumber = " + mammalAgeAsNumber);

        mammal.displayDetailsStatic();
        mammal.displayDetailsStatic();
        animalMammal.displayDetailsStatic();


    }
}
