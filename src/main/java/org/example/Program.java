package org.example;

import io.helidon.common.http.Http;
import io.helidon.webserver.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import java.util.concurrent.Flow;



/**
 * Author: Felipe Castro
 * Class: Program.java
 * Information: Class to Implement the Interface called Menu and create the Program
 */

public class Program implements Menu, Handler {
    // Attributes
    static String OPTION = "";
    static String USER_NAME = "";
    Scanner scanner = new Scanner(System.in); //System.in is a standard input stream

    // Methods
    public void initializeProgram() {
        while (!(OPTION.equals("5"))) {
            /* Clearing the Screen */
            System.out.flush();


            OPTION = displayPrincipalMenu();
            switch (Integer.parseInt(OPTION)) {
                case 0:
                    initializingWebServer();
                    OPTION = "6";
                    break;
                case 1:
                    OPTION = displayHello();
                    break;
                case 2:
                    OPTION = displayPersons();
                    break;
                case 3:
                    OPTION = displayAnimals();
                    break;
                case 4:
                    OPTION = displayAlgorithms();
                    break;
                case 5:
                    System.out.println("--------------- Good Bye :( ----------------");
                    System.out.println("Thanks for using the program, take care!");
                    System.out.println();
                    System.out.println();

                    /* Doing a Pause */
                    System.out.print("Press any key to return to the main menu . . . ");
                    scanner.nextLine();

                    break;
                default:
                    System.out.println("--------------- ERROR----------------");
                    System.out.println("Please insert a valid option");

                    System.out.println();
                    System.out.println();

                    /* Doing a Pause */
                    System.out.print("Press any key to return to the main menu . . . ");
                    scanner.nextLine();

                    break;
            }
        }
    }

    //
    public String displayHello() {
        System.out.println("--------------- Hello World!! ---------------");
        System.out.println();
        System.out.println();

        /* Doing a Pause */
        System.out.print("Press any key to return to the main menu . . . ");
        scanner.nextLine();

        return "6";

    }

    // Implementing methods from the interface

    public String displayPrincipalMenu() {
        System.out.println("--------------- Principal Menu ----------------");
        System.out.println("Hello " + USER_NAME + ". Please enter the number of the option:");
        System.out.println("0. Initialize WebServer");
        System.out.println("1. Simple Hello World.");
        System.out.println("2. Display Persons Information.");
        System.out.println("3. Display Animals Information.");
        System.out.println("4. Display Algorithms.");
        System.out.println("5. Exit Program");
        return scanner.nextLine(); // Capturing and returning the string
    }

    public String displayPersons() {
        System.out.println("--------------- Persons Information ----------------");
        System.out.println("--- Printing Information about the Persons --");
        // Person1
        Person person1 = new Person();
        person1.setName("Yenifer");
        person1.setAge(24);
        person1.personalInformation();
        // Person2
        Person person2 = new Person("402300414", "Yenifer", 25, false);
        person2.personalInformation();
        // Person3
        Person person3 = new Person("402300415", "Kimberly", 25, false);
        // Person4
        Person person4 = new Person("116890359", "Guillermo", 24, false);

        // Comparing Person1 and Person2 Names
        if (!(person1.getName().equals(person2.getName()))) {
            System.out.println("The names of Person1 and Person2 are different");
        } else {
            System.out.println("The names of Person1 and Person2 are equal");
        }
        System.out.println();

        // Testing the switch
        person1.checkProvinceBasedOnID();
        person2.checkProvinceBasedOnID();
        System.out.println();

        // Simple Array
        String[] names = {person1.getName(), person2.getName()};

        // Creating an Array of Persons
        Person[] persons = new Person[2];
        persons[0] = person3;
        persons[1] = person4;

        // Printing the information of the Persons on the Array
        System.out.println("Printing the information of the persons on the Array with For Each: ");
        int totalOfAges = 0;
        for (Person person :
                persons) {
            person.personalInformation();
            totalOfAges += person.getAge();
        }
        System.out.println("The sum of the ages from the persons on the array is " + totalOfAges);
        System.out.println();

        System.out.println("Printing the information of the persons on the Array with For I: ");
        for (int i = 0; i < persons.length; i++) {
            System.out.println("I am the person located in the position " + (i + 1) + " of the Array");
            persons[i].personalInformation();
        }
        System.out.println();
        System.out.println();

        /* Doing a Pause */
        System.out.print("Press any key to return to the main menu . . . ");
        scanner.nextLine();

        return "6";

    }

    public String displayAnimals() {
        System.out.println("--------------- Animals Information ----------------");
        System.out.println("--- Printing Information about the Animals --");

        // First creating the persons
        Person person = new Person("116890358", "Felipe", 24, false);
        Person person2 = new Person("116890359", "Guillermo", 24, false);
        // Then creating the Dogs
        Dog dog = new Dog("Rex", "1", 2, "Bulldog", true, null);
        Dog dog2 = new Dog("Perla", "2", 4, "Zaguate", false, person);
        Dog dog3 = new Dog("Lila", "3", 6, "Zaguate", false, person2);
        // Also creating the Sharks
        Shark shark = new Shark("Tux", "4", 5, 200, 100, false);
        Shark shark2 = new Shark("Tuxo", "5", 6, 150, 70, true);


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
            System.out.println();
        }
        System.out.println();

        // Using a foreach to print the information
        System.out.println("Printing the Dogs Information using a For Each");
        for (Dog animal : dogs) {
            animal.dogInformation();
        }


        // Creating a Polyformic List of Animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog3);
        animals.add(dog);
        animals.add(shark);
        animals.add(shark2);

        // Polyformic List
        System.out.println("Printing a Polyformic List");
        for (Animal animal : animals) {
            // Checking type of Object
            if (animal.getClass().equals(Dog.class)) {
                System.out.println("-- Dog -- ");
                ((Dog) animal).dogInformation();
            } else {
                System.out.println("-- Shark -- ");
                ((Shark) animal).sharkInformation();
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        /* Doing a Pause */
        System.out.print("Press any key to return to the main menu . . . ");
        scanner.nextLine();

        return "6";
    }

    public String displayAlgorithms() {
        // Pending to Implement
        return "6";
    }

    // ---------------------- Methods for WebServer ----------------------

    // (Implementing the Handler Method) Creating a Basic REST Service Application
    public void accept(ServerRequest request, ServerResponse response) {
        response.status(Http.Status.OK_200);
        response.headers().put("Content-Type", "text/plain; charset=UTF-8");
        response.send("Hello World, I am creating a Basic REST Service Application");
    }

    // Initializing the Web Server
    public void initializingWebServer() {
        try {
            Program restProgram = new Program();
            System.out.println("--------------- Initializing Web Server ---------------");
            Routing routing = Routing.builder().get("/intro",restProgram).build();
            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8080).build();
            WebServer webServer = WebServer.create(config, routing);
            webServer.start();
            System.out.println("Initialized Web Server Without issues");
            System.out.println("Access on your browser: "+"http://192.168.0.6:8080/intro");
            /* Doing a Pause */
            System.out.print("Press any key to return to the main menu . . . ");
            scanner.nextLine();

        } catch (UnknownHostException ex) {
            System.out.println("Error Message: "+ex.getMessage());
            ex.printStackTrace();
        }
    }


}
