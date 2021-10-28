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
