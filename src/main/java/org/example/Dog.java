package org.example;

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
}
