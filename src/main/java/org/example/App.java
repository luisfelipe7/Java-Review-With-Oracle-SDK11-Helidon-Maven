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
        Program program = new Program();
        Program.OPTION = "6";
        Scanner scanner = new Scanner(System.in);

        // Doing a Quick Presentation
        System.out.println("--------------- Java Basics -----------------");
        System.out.println("Welcome! Please enter your name");
        Program.USER_NAME = scanner.nextLine();
        System.out.flush();
        program.initializeProgram();

    }
}
