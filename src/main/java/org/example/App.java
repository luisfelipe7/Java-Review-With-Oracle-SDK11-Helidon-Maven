package org.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * Author: Felipe Castro
 * Class: App.java
 * Information: Class to Implement the Main of our App
 */
public class App {
    public static void main(String[] args) throws IOException {
        /* Declaring Variables */
        Scanner scan = new Scanner(System.in);
        Person person = new Person();
        Dog dog = new Dog();

        /* Doing a Quick Hello World */
        System.out.println("Hello World!");
        System.out.println();

        /* Doing Quick Test with Person Class */
        person.doingQuickTests();

        /* Doing a Pause */
        System.out.print("Press any key to continue . . . ");
        scan.nextLine();

        /* Clearing the Screen */
        System.out.flush();

        /* Printing the Dog Information */
        dog.doingQuickTests();

        /* Doing a Pause */
        System.out.print("Press any key to continue . . . ");
        scan.nextLine();

        /* Clearing the Screen */
        System.out.flush();
    }
}
