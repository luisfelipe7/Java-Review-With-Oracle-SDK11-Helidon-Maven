package org.example;

/**
 * Author: Felipe Castro
 * Class: Shark.java
 * Information: Class to Implement the Shark
 */

public class Shark extends Animal {
    private double speedKMH;
    private double lengthM;
    private boolean underCaptivity;

    // Constructors
    public Shark() {
        speedKMH = 450;
        lengthM = 4;
        underCaptivity = false;
    }

    public Shark(String name, String id, int age, double speedKMH, double lengthM, boolean underCaptivity) {
        super(name, id, age);
        this.speedKMH = speedKMH;
        this.lengthM = lengthM;
        this.underCaptivity = underCaptivity;
    }

    // Get Methods
    public double getSpeedKMH() {
        return speedKMH;
    }

    // Set Methods
    public void setSpeedKMH(double speedKMH) {
        this.speedKMH = speedKMH;
    }

    public double getLengthM() {
        return lengthM;
    }

    public void setLengthM(double lengthM) {
        this.lengthM = lengthM;
    }

    public boolean getUnderCaptivity() {
        return underCaptivity;
    }

    public void setUnderCaptivity(boolean underCaptivity) {
        this.underCaptivity = underCaptivity;
    }

    // Methods from the Parent
    void typeOfAnimal() {
        System.out.println("I am a shark");
    }

    void makeSound() {
        System.out.println("I don't make sound");
    }

    public void sleep() {
        System.out.println("I don't sleep");
    }

    public void move() {
        System.out.println("I am swimming");
    }

    // Methods

    public void hunt() {
        System.out.println("I am hunting my food");
        System.out.println("Done :) ");
        super.eat();
    }

    public void sharkInformation() {
        super.information();
        System.out.println("My speed is " + speedKMH + " km/h");
        System.out.println("My length is " + lengthM + " m");
        if (underCaptivity) {
            System.out.println("I am under captivity :(");
        } else {
            System.out.println("I am not under captivity :)");
        }
    }

}
