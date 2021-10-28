package org.example;


/**
 * Author: Felipe Castro
 * Class: Animal.java
 * Information: Class to Implement the Animal
 */


abstract class Animal {
    // Attributes
    protected String name;
    protected String id;
    protected int age;

    // Constructors
    public Animal() {
        name = "";
        id = "";
        age = 0;
    }

    public Animal(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Gets Methods

    public String getName() {
        return name;
    }

    // Sets Methods
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Abstract Methods = Virtual Void Methods
    abstract void typeOfAnimal();

    abstract void makeSound();

    // Normal Methods
    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void move() {
        System.out.println("I am moving");
    }

    public void information() {
        System.out.println("I am " + name);
        System.out.println("My id is " + id);
        System.out.println("I am " + age + " years old");
    }
}
