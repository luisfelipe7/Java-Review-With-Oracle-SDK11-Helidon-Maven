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

        // Putting a try/catch
        try {
            // Code to apply under the try/catch
            System.out.println("--------------- Java Basics -----------------");
            System.out.println("Welcome! Please enter your name");
            Program.USER_NAME = scanner.nextLine();
            System.out.flush();
            program.initializeProgram();

            // Checking if we are having a null pointer exception
        } catch (NullPointerException e) {
            String errorMessage = e.getMessage();
            System.out.println("Exception, here is the error: " + errorMessage);
            e.printStackTrace();
            // Checking if we are having any other exceptions
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            System.out.println("Exception, here is the error: " + errorMessage);
        }
    }
}
