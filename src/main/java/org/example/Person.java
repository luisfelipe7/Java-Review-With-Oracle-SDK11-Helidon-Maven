package org.example;

/**
 * Author: Felipe Castro
 * Class: Person.java
 * Information: Class to Implement the Person
 */

public class Person {
    // Attributes
    private String id;
    private String name;
    private int age;
    private boolean isDead;

    // Methods
    public Person() {
        name = "";
        age = 0;
        isDead = false;
        id = "";
    }

    public Person(String id, String name, int age, boolean isDead) {
        this.name = name;
        this.age = age;
        this.isDead = isDead;
        this.id = id;
    }

    // Overloading the Constructor of Person
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void personalInformation() {
        System.out.println("---------------------------");
        System.out.println("My id is " + id);
        System.out.println("I am " + name);
        System.out.println("I am " + age + " years old");
        if ((!isDead)) {
            System.out.println("I am not dead :)");
        } else {
            System.out.println("I am dead :(");
        }
        System.out.println("---------------------------");
    }

    public void checkProvinceBasedOnID() {
        System.out.println("----- Province by Id -----");
        if (id.equals("")) {
            System.out.println("The id is not defined");
        } else {
            switch (Integer.parseInt(Character.toString(id.charAt(0)))) {
                case 1:
                    System.out.println("I was born in San Jose");
                    break;
                case 4:
                    System.out.println("I was born in Heredia");
                    break;
                default:
                    System.out.println("My id is invalid");
                    break;
            }
        }
    }

    // Method to do Quick Tests
    public void doingQuickTests() {
        System.out.println("++++++++++++++++++ Doing Quick Tests ++++++++++++++++++");
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

    // Gets Methods
    public String getName() {
        return name;
    }

    // Sets Methods
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
