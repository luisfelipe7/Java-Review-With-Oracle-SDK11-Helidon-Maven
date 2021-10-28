package org.example;

/**
 * Author: Felipe Castro
 * Class: App.java
 * Information: Class to Implement the Main of our App
 */
public class App {
    public static void main(String[] args) {
        /* Doing a Quick Hello World */
        System.out.println("Hello World!");
        System.out.println("");

        /* Creating  Persons to do multiple tests */
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

    }
}
