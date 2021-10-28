package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Felipe Castro
 * Class: Animal.java
 * Information: Class to Implement the Animal
 */

public class Dog extends Animal {
    // Attributes
    private String raceName;
    private boolean underAdoption;
    private Person owner;

    // Constructors
    public Dog() {
        raceName = "";
        underAdoption = true;
        owner = null;
    }

    public Dog(String name, String id, int age, String raceName, boolean underAdoption, Person owner) {
        super(name, id, age);
        this.raceName = raceName;
        this.underAdoption = underAdoption;
        this.owner = owner;
    }

    // Methods
    public void dogInformation() {
        super.information();
        System.out.println("My race is " + raceName);
        if (underAdoption) {
            System.out.println("I am under adoption :(");
        } else {
            System.out.println("I am not under adiption :)");
            System.out.println("My onwer information is:");
            owner.personalInformation();
        }
    }

    // Gets Methods
    public String getRaceName() {
        return raceName;
    }

    // Set Methods
    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public boolean isUnderAdoption() {
        return underAdoption;
    }

    public void setUnderAdoption(boolean underAdoption) {
        this.underAdoption = underAdoption;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Implementing Parent Methods
    public void typeOfAnimal() {
        System.out.println("I am a Dog");
    }

    public void makeSound() {
        System.out.println("Guau Guau");
    }

    public void move() {
        System.out.println("I am moving with my paws");
    }

    // Doing QuickTests
    void doingQuickTests() {
        // First creating the persons
        Person person = new Person("116890358", "Felipe", 24, false);
        Person person2 = new Person("116890359", "Guillermo", 24, false);
        // Then creating the Dogs
        Dog dog = new Dog("Rex", "1", 2, "Bulldog", true, null);
        Dog dog2 = new Dog("Perla", "2", 4, "Zaguate", false, person);
        Dog dog3 = new Dog("Lila", "3", 6, "Zaguate", false, person2);

        // Creating a List with the Dogs
        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(dog);
        dogs.add(dog2);
        dogs.add(dog3);

        // Creating an iterator
        Iterator<Dog> dogsIterator = dogs.iterator();

        // Printing the Dog information with the iterator
        System.out.println("Printing the Dogs Information Using an Iterator");
        while (dogsIterator.hasNext()) {
            Dog temp = dogsIterator.next();
            temp.dogInformation();
            temp.makeSound();
            temp.typeOfAnimal();
            temp.move();
            temp.eat();
            System.out.println("");
        }
        System.out.println();

        // Using a foreach to print the information
        System.out.println("Printing the Dogs Information using a For Each");
        for (Dog animal : dogs) {
            animal.dogInformation();
        }
    }
}
